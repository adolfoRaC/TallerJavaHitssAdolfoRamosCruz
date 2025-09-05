package ejercicio.test;

import java.time.LocalDate;

import ejercicio.clases.Producto;
import ejercicio.impl.Comics;
import ejercicio.impl.IPhone;
import ejercicio.impl.Libro;
import ejercicio.impl.TvLcd;
import ejercicio.interfaces.IProducto;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[4];

        productos[0] = new IPhone(30000, "Apple", "15 Pro Max", "Gris");
        productos[1] = new TvLcd(90000, "Samsung", 32);
        productos[2] = new Libro(549, LocalDate.of(2025, 6, 12)  ,"Stephen King", "No tengas miedo", "PLAZA & JANÉS");
        productos[3] = new Comics(250, LocalDate.of(2004, 8, 18), "Bryan Lee O'Malley", "Scott Pilgrim's Precious Little Life", "Kamite", "Scott Pilgrim");
        

        for (IProducto producto : productos) {
            System.out.println(producto);
        }
    }
}
