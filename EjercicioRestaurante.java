package ejercicios;

import java.util.Scanner;

public class EjercicioRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double precioPedido, totalVentas = 0;
        String nombrePedido;
        do {
            System.out.println("Menú");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar total de ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Nombre del pedido: ");
                    nombrePedido = sc.nextLine();
                    System.out.print("Precio del pedido: ");
                    precioPedido = sc.nextDouble();

                    if (precioPedido > 0) {
                        totalVentas += precioPedido;
                        System.out.println("El pedido " + nombrePedido + " ha sido registrado");
                    } else {
                        System.out.println("El precio no puede ser 0");
                    }
                }
                case 2 -> System.out.println("Total de ventas: " + totalVentas);
                case 3 -> System.out.println("Haz salido con éxito!");
                default -> System.out.println("Opción incorrecta, vuelva a intentarlo");

            }
        } while (opcion != 3);

        sc.close();
    }
}
