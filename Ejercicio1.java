package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primer número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Segundo número: ");
        int numero2 = entrada.nextInt();
        int resultado = 0;
        for (int i = 0; i < Math.abs(numero1); i++) {
            resultado += numero2;
        }
        if (numero1 < 0) {
            resultado = -resultado;
        } else if (numero2 < 0 && numero1 < 0) {
            resultado = -resultado;
        }
        System.out.println(resultado);
        entrada.close();
    }
}
