package ejercicio.test;

import genericosSupermercado.clases.Cliente;
import genericosSupermercado.clases.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Adolfo", "Ramos", "54861", "Calle revolución", 2500, 5000);
        g1.aumentarRemuneracion(0.02);
        g1.setPresupuesto(60000);
        System.out.println(g1);
        

        System.out.println("------ Cliente ------");
        Cliente c1= new Cliente("Jose", "Aguilar", "18465", "Avenida Hidalgo");
        System.out.println(c1);
    }
}
