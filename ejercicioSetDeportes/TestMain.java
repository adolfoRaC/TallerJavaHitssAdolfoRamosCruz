package ejercicioSetDeportes;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import ejercicioSetDeportes.clases.Inscripcion;
import ejercicioSetDeportes.enums.Diciplina;
import ejercicioSetDeportes.modelos.Jugador;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inscripcion futbol = new Inscripcion(Diciplina.Futbol);
        Inscripcion basquetbol = new Inscripcion(Diciplina.Basquetbol);
        Inscripcion voleibol = new Inscripcion(Diciplina.Voleibol);

        Jugador j1 = new Jugador(1, "Carlos");
        Jugador j2 = new Jugador(2, "Ana");
        Jugador j3 = new Jugador(3, "Pedro");
        Jugador j4 = new Jugador(4, "Jose");
        Jugador j5 = new Jugador(5, "Luis");
        Jugador j6 = new Jugador(6, "Marta");
        Jugador j7 = new Jugador(7, "Sofía");

        futbol.registrarJugador(j1);
        futbol.registrarJugador(j1);
        futbol.registrarJugador(j2);
        futbol.registrarJugador(j3);

        basquetbol.registrarJugador(j3);
        basquetbol.registrarJugador(j1);

        basquetbol.registrarJugador(j4);
        basquetbol.registrarJugador(j5);

        voleibol.registrarJugador(j6);
        voleibol.registrarJugador(j7);

        int opcion;
        do {
            System.out.println("1 - Mostrar jugadores por deporte");
            System.out.println("2 - Contar jugadores en cada disciplina jugadores por deporte");
            System.out.println("3 - Fusionar equipos (unión)");
            System.out.println("4 - jugadores en común (intersección)");
            System.out.println("5 - Transferir un jugador de un deporte a otro");
            System.out.println("6 - Mostrar todos los jugadores ordenados por nombre");
            System.out.println("7 - Mostrar todos los jugadores en orden de inscripción");
            System.out.println("8 - Mostrar ranking de jugadores por ID");
            System.out.println("9 - Agregar jugador");
            System.out.println("10 - Salir");
            System.out.print("Selecciones una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Fútbol: " + futbol.getJugadoresHashSet());
                    System.out.println("Básquetbol: " + basquetbol.getJugadoresHashSet());
                    System.out.println("Vóleibol: " + voleibol.getJugadoresHashSet());
                }
                case 2 -> {
                    System.out.println("Fútbol: " + futbol.contarJugadores());
                    System.out.println("Básquetbol: " + basquetbol.contarJugadores());
                    System.out.println("Vóleibol: " + voleibol.contarJugadores());
                }
                case 3 -> {
                    Set<Jugador> fusion = new HashSet<>(futbol.getJugadoresHashSet());
                    fusion.addAll(basquetbol.getJugadoresHashSet());
                    System.out.println("Fusión Fútbol + Básquetbol: " + fusion);
                }
                case 4 -> {
                    Set<Jugador> comun = new HashSet<>(futbol.getJugadoresHashSet());
                    comun.retainAll(basquetbol.getJugadoresHashSet());
                    System.out.println("Jugadores en común en Fútbol y Básquetbol: " + comun);
                }
                case 5 -> {
                    System.out.print("ID del jugador a transferir de Básquetbol a Fútbol: ");
                    int id = sc.nextInt();
                    Jugador transferir = null;

                    for (Jugador jugador : basquetbol.getJugadoresHashSet()) {
                        if (jugador.getId() == id) {
                            transferir = jugador;
                        }
                    }

                    if (transferir != null) {
                        basquetbol.eliminarJugador(transferir);
                        futbol.registrarJugador(transferir);
                        System.out.println("Jugador transferido: " + transferir);
                    } else {
                        System.out.println("Jugador no encontrado en Básquetbol");
                    }

                }
                case 6 -> {
                    System.out.println("Fútbol: " + futbol.getJugadoresTreeSet());
                    System.out.println("Básquetbol: " + basquetbol.getJugadoresTreeSet());
                    System.out.println("Vóleibol: " + voleibol.getJugadoresTreeSet());
                }
                case 7 -> {
                    System.out.println("Fútbol: " + futbol.getJugadoresLinkedHash());
                    System.out.println("Básquetbol: " + basquetbol.getJugadoresLinkedHash());
                    System.out.println("Vóleibol: " + voleibol.getJugadoresLinkedHash());
                }
                case 8 -> {
                    TreeSet<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
                    ranking.addAll(futbol.getJugadoresHashSet());
                    ranking.addAll(basquetbol.getJugadoresHashSet());
                    ranking.addAll(voleibol.getJugadoresHashSet());
                    System.out.println("Ranking por ID: " + ranking);
                }
                case 9 -> {
                    System.out.print("Agregar ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Agregar nombre: ");
                    String nombre = sc.nextLine();
                    if (id != 0 && !nombre.isEmpty()) {
                        Jugador jugador = new Jugador(id, nombre);

                        System.out.println("¿En qué deporte desea registrarse?");
                        System.out.println("1. Fútbol");
                        System.out.println("2. Básquetbol");
                        System.out.println("3. Vóleibol");
                        System.out.print("Opción: ");
                        int deporte = sc.nextInt();
                        sc.nextLine(); // limpia buffer

                        switch (deporte) {
                            case 1 -> {
                                if (futbol.registrarJugador(jugador)) {
                                    System.out.println("Jugador registrado en Fútbol: " + jugador);
                                } else {
                                    System.out.println("El jugador ya está inscrito en Fútbol.");
                                }
                            }
                            case 2 -> {
                                if (basquetbol.registrarJugador(jugador)) {
                                    System.out.println("Jugador registrado en Básquetbol: " + jugador);
                                } else {
                                    System.out.println("El jugador ya está inscrito en Básquetbol.");
                                }
                            }
                            case 3 -> {
                                if (voleibol.registrarJugador(jugador)) {
                                    System.out.println("Jugador registrado en Vóleibol: " + jugador);
                                } else {
                                    System.out.println("El jugador ya está inscrito en Vóleibol.");
                                }
                            }
                            default -> System.out.println("Opción inválida");
                        }
                    }
                }
                case 10 -> {
                    System.out.println("Programa finalziado");
                }

                default -> {
                    System.out.println("Opción no existente");
                }
            }
        } while (opcion != 10);
        sc.close();
    }
}
