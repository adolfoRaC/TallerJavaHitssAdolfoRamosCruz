package ejercicioExcepciones.test;

import java.util.Scanner;

import ejercicioExcepciones.clases.Alumno;
import ejercicioExcepciones.excepcions.EdadInvalidaException;

public class TestMain {

    private static void validarEdad(int edad) throws EdadInvalidaException, IllegalArgumentException {
        if (edad > 0 && edad < 18) {
            throw new EdadInvalidaException("El alunmo debe ser mayor de edad");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser un número positivo");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alumno[] alumnos = new Alumno[3];
        int contador = 0;

        while (true) {
            try {
                System.out.print("Ingresa el nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingresa la edad: ");
                int edad = sc.nextInt();

                validarEdad(edad);

                Alumno alumno = new Alumno(nombre, edad);
                alumnos[contador] = alumno;
                contador++;
                sc.nextLine();
            } catch (EdadInvalidaException e) {
                System.out.println("Error:" + e.getMessage());
                sc.close();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: No se puede agregar más alumnos: " + e.getMessage());
                sc.close();

                return;
            } catch (IllegalArgumentException e) {
                System.out.println("Error:" + e.getMessage());
                sc.close();

            }

        }

    }
}
