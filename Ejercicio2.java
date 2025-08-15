package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorMenor = Integer.MAX_VALUE, valor1 = 0;

        System.out.println("Ingres la cantidad de número a comparar (min 10): ");
        int ciclo = entrada.nextInt();

        if (ciclo >= 10) {

            for (int i = 1; i <= ciclo; i++) {
                System.out.print("Ingresa el siguiente valor: ");
                valor1 = entrada.nextInt();
                if (valor1 < valorMenor) {
                    valorMenor = valor1;
                }
            }

            if (valorMenor < 10) {
                System.out.println("El valor es menor  a 10!: " + valorMenor);
            } else {
                System.out.println("El valor es mayor o igual a 10!: " + valorMenor);
            }
        }

        entrada.close();
    }
}
