package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        String[][] matriz = new String[n][n];

        if (n > 0) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    if (i == j) {
                        matriz[i][j] = "X";
                    } else {
                        matriz[i][j] = "_";
                    }

                    if (i + j == n - 1) {
                        matriz[i][j] = "X";
                    }
                }
            }

            for (String[] fila : matriz) {
                for (String elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println("");

            }
        } else {
            System.out.println("Error");
        }

        sc.close();
    }
}
