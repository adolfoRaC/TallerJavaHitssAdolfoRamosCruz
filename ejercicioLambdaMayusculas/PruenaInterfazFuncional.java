package ejercicioLambdaMayusculas;

import interfaces.Operacion;
import interfaces.Transformador;

public class PruenaInterfazFuncional {
    public static void main(String[] args) {
        // Implementar con lamda
        Operacion sunma = (a, b) -> a + b;
        System.out.println("Suma: " + sunma.calcular(5, 8));

        Operacion resta = (x, y) -> x - y;
        System.out.println("Resta: " + resta.calcular(16, 8));

        // Lambda que transforma de string a mayusculas <String>

        Transformador<String, String> aMayuscula = s-> s.toUpperCase();

        System.out.println("A mayuscula: "+  aMayuscula.transformar("adolfo"));

    }
}
