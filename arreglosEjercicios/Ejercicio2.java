package arreglos.ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 3, 4, 5, 5, 5, 6, 7 };
        int[] cont = new int[10];
        int ocurrencia = 0, elementoRepetido = 0;

        for (int numero : numeros) {
            cont[numero]++;
        }

        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > ocurrencia) {
                ocurrencia = cont[i];
                elementoRepetido = i;
            }
        }

        System.out.println("La mayor ocurrencias es: " + ocurrencia);
        System.out.println("El elemento que más se repite es: " + elementoRepetido);

    }
}

