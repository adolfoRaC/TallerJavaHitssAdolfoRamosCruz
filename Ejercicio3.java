package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0, promedio = 0;
        int contador = 0;
        boolean bandera = true;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese nota: ");
            double nota = entrada.nextDouble();
            if (nota < 1 || nota > 10) {
                System.out.println("Error: Finalizando el programa");
                bandera = false;
                break;
            } else {
                suma += nota;
                if (nota == 1) {
                    contador++;
                }
            }
        }
        if (bandera) {

            promedio = suma / 20;
            if (promedio >= 6) {
                System.out.println("Promedio " + promedio + "es mayor a 6");
            } else {
                System.out.println("Promedio " + promedio + " es menor a 6, notas iguales a 1 es de: " + contador);
            }
        }
        entrada.close();
    }
}
