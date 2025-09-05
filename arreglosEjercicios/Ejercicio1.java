package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] numeros = new int[N];
        System.out.println("Ingrese los datos: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[numeros.length - 1 - i]);
            System.out.println(numeros[i]);

        }
        sc.close();
    }
}
