package genericosSupermercado.test;

import java.util.List;

import genericosSupermercado.clases.Fruta;
import genericosSupermercado.clases.Lacteo;
import genericosSupermercado.clases.Limpieza;
import genericosSupermercado.clases.NoPerecible;
import genericosSupermercado.repositorio.Bolsa;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("=========== Lacteos ===========");
        Bolsa<Lacteo> lacteoBolsa = new Bolsa<>();
        lacteoBolsa.agregar(new Lacteo("Lecha lala", 20.50, 3, 15));
        lacteoBolsa.agregar(new Lacteo("Yoghurt Danone", 12.75, 2, 10));
        lacteoBolsa.agregar(new Lacteo("Queso Manchego", 45.90, 1, 8));
        lacteoBolsa.agregar(new Lacteo("Mantequilla Gloria", 30.00, 2, 12));
        lacteoBolsa.agregar(new Lacteo("Crema Alpura", 28.50, 1, 20));
        lacteoBolsa.agregar(new Lacteo("Crema Alasdpura", 284.50, 1, 20));


        List<Lacteo> lacteos = lacteoBolsa.obtenerTodos();
        for (Lacteo lacteo : lacteos) {
            System.out.println(lacteo);
        }
        System.out.println("=========== Fruta ===========");

        Bolsa<Fruta> frutaBolsa = new Bolsa<>();
        frutaBolsa.agregar(new Fruta("Manzana", 15, 1.5, "Rojo"));
        frutaBolsa.agregar(new Fruta("Plátano", 12, 1.2, "Amarillo"));
        frutaBolsa.agregar(new Fruta("Naranja", 18, 2.0, "Naranja"));
        frutaBolsa.agregar(new Fruta("Uva", 25, 0.8, "Morado"));
        frutaBolsa.agregar(new Fruta("Pera", 22, 1.3, "Verde"));

        List<Fruta> frutas = frutaBolsa.obtenerTodos();
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("=========== Limpieza ===========");

        Bolsa<Limpieza> limpiezaBolsa = new Bolsa<>();
        limpiezaBolsa.agregar(new Limpieza("alcohol isopropilico", 35, "TV, Computadores", 1));
        limpiezaBolsa.agregar(new Limpieza("Detergente Ariel", 50, "Ropa", 2));
        limpiezaBolsa.agregar(new Limpieza("Cloro Cloralex", 25, "Baño y cocina", 1));
        limpiezaBolsa.agregar(new Limpieza("Limpiavidrios Windex", 40, "Vidrios y espejos", 1));
        limpiezaBolsa.agregar(new Limpieza("Suavitel Fresca Primavera", 45, "Ropa", 2));

        List<Limpieza> limpiezas = limpiezaBolsa.obtenerTodos();
        for (Limpieza limpieza : limpiezas) {
            System.out.println(limpieza);
        }

        System.out.println("=========== No Perecible ===========");

        Bolsa<NoPerecible> noPerecibleBolsa = new Bolsa<>();
        noPerecibleBolsa.agregar(new NoPerecible("Atún Dolores", 25, 140, 250));
        noPerecibleBolsa.agregar(new NoPerecible("Frijoles La Sierra", 18, 430, 350));
        noPerecibleBolsa.agregar(new NoPerecible("Sopa Maruchan", 12, 64, 290));
        noPerecibleBolsa.agregar(new NoPerecible("Arroz Verde Valle", 30, 1000, 3600));
        noPerecibleBolsa.agregar(new NoPerecible("Lentejas Verde Valle", 32, 900, 3100));

        List<NoPerecible> noPerecibles = noPerecibleBolsa.obtenerTodos();
        for (NoPerecible noPerecible : noPerecibles) {
            System.out.println(noPerecible);
        }

    }
}
