package ejercicioStreamsEvaluacionDesempeño.test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ejercicioStreamsEvaluacionDesempeño.models.Empleado;
import ejercicioStreamsEvaluacionDesempeño.models.Evaluacion;

public class Reportes {
        public static void main(String[] args) {
                // Empleados
                Empleado emp1 = new Empleado(1, "Juan Pérez", "TI", 50000, 5);
                Empleado emp2 = new Empleado(2, "María Gómez", "RH", 60000, 7);
                Empleado emp3 = new Empleado(3, "Carlos López", "Finanzas", 55000, 6);
                Empleado emp4 = new Empleado(4, "Ana Martínez", "TI", 70000, 8);
                Empleado emp5 = new Empleado(5, "Luis Rodríguez", "RH", 45000, 4);
                Empleado emp6 = new Empleado(6, "Sofía Fernández", "TI", 72000, 9);

                // Agregar evaluaciones
                emp1.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 5, 27), 80));
                emp1.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 6, 18), 85));

                emp2.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 5, 23), 70));
                emp2.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 7, 4), 80));

                emp3.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 11, 4), 60));
                emp3.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 5, 4), 65));

                emp4.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 3, 3), 90));
                emp4.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 5, 30), 85));

                emp5.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 5, 4), 75));
                emp5.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 9, 13), 80));

                emp6.agregarEvaluacion(new Evaluacion(LocalDate.of(2025, 10, 15), 88));
                emp6.agregarEvaluacion(new Evaluacion(LocalDate.of(2024, 11, 20), 92));

                List<Empleado> empleados = List.of(emp1, emp2, emp3, emp4, emp5, emp6);

                // 1. - Listar todos los empleados de un departamento específico
                System.out.println("Empleados del departamento de TI:");
                empleados.stream().filter(e -> e.getDepartamento().equals("TI")).forEach(System.out::println);

                // 2. - Calcular el salario promedio por departamento
                System.out.println("\nSalario promedio por departamento:");
                empleados.stream()
                                .collect(Collectors.groupingBy(Empleado::getDepartamento,
                                                Collectors.averagingDouble(Empleado::getSalario)))
                                .forEach((dept, salario) -> System.out
                                                .println("Departamento: " + dept + ", Salario Promedio: " + salario));

                // 3. - Obtener el empleado con mayor salario en toda la empresa
                System.out.println("\nEmpleado con mayor salario:");
                empleados.stream().max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()))
                                .ifPresent(System.out::println);

                // 4. - Listar todos los empleados con más de 5 años de experiencia y salario
                // mayor a 50,000
                System.out.println("\nEmpleados con más de 5 años de experiencia y salario mayor a 50,000:");
                empleados.stream()
                                .filter(e -> e.getAniosExperiencia() >= 5 && e.getSalario() >= 50000)
                                .forEach(System.out::println);

                // 5. - Obtener el top 3 de empleados con mejor puntaje en la última evaluación
                // (último año)
                System.out.println("\nTop 3 empleados con mejor puntaje en la última evaluación:");

                empleados.stream().collect(Collectors.toMap(Empleado::getNombre, e -> e.getEvaluaciones().stream()
                                .max(Comparator.comparing(Evaluacion::getAnio))
                                .map(Evaluacion::getPuntaje).orElse(0)))
                                .entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                .limit(3)
                                .forEach(e -> System.out.println(
                                                "Empleado: " + e.getKey() + ", Promedio Puntaje: " + e.getValue()));
                // 6. - Contar cuántos empleados tienen al menos una evaluación superior a 90
                // puntos. no importante el año
                System.out.println("\nEmpleados con al menos una evaluación superior a 90 puntos:");
                empleados.stream().filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() >= 90))
                                .forEach(System.out::println);

                // 7. - Generar un ranking de promedio de puntajes por empleado.
                System.out.println("\nRanking de promedio de puntajes por empleado:");
                empleados.stream().collect(Collectors.toMap(Empleado::getNombre,
                                e -> e.getEvaluaciones().stream()
                                                .mapToInt(Evaluacion::getPuntaje)
                                                .average()
                                                .orElse(0.0)))
                                .entrySet().stream()
                                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                                .forEach(e -> System.out.println(
                                                "Empleado: " + e.getKey() + ", Promedio Puntaje: " + e.getValue()));

        }
}
