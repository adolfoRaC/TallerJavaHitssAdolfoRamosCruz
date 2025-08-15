package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Usuario actualizado correctamente");
                case 2 -> System.out.println("Usuario eliminado correctamente");
                case 4 -> System.out.println("Usuario creado correctamente");
                case 3 -> System.out.println("Lista de usuarios");
                case 5 -> System.out.println("Haz salido con éxito!");
                default -> System.out.println("Error al seleccionar una opción, vuelva a intentarlo");
            }
        } while (opcion != 5);

        sc.close();
    }
}
