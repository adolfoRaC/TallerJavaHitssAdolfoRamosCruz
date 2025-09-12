package ejercicio.test;

import genericosSupermercado.clases.Guepardo;
import genericosSupermercado.clases.Leon;
import genericosSupermercado.clases.Lobo;
import genericosSupermercado.clases.Mamifero;
import genericosSupermercado.clases.Perro;
import genericosSupermercado.clases.Tigre;

public class TestMain {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero tigre = new Tigre("Selvas tropicales", 1.2f, 2.4f,
                110, "Panthera tigris", 10,
                65, "Paterinos");

        Mamifero leon = new Leon("Sabana africana", 1.2f, 2.7f,
                190, "Panthera leo", 7.5f,
                60, 15, 114.5f);

        Mamifero guepardo = new Guepardo("Sabana y desierto", 0.9f, 2.1f,
                55, "Acinonyx jubatus", 3.5f,
                115);

        Mamifero lobo = new Lobo("Bosques y tundra", 0.85f, 1.5f, 40,
                "Canis lupus", "gris", 4,
                6, "Lobo gris");

        Mamifero perro = new Perro("Doméstico", 0.6f, 1.0f,
                30, "Canis lupus familiaris", "marrón",
                2, 235);

        mamiferos[0] = tigre;
        mamiferos[1] = leon;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero mamifero : mamiferos) {
            System.out.println("====================================================");
            System.out.println(mamifero);
            System.out.println();
            System.out.println("Come: " + mamifero.comer());
            System.out.println();
            System.out.println("Dormir: " + mamifero.dormir()); 
            System.out.println();
            System.out.println("Correr: " + mamifero.correr());
            System.out.println();
            System.out.println("Comunicarse: " + mamifero.comunicarse());

        }

    }
}
