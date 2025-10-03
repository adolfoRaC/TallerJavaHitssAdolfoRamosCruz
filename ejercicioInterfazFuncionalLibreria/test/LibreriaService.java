package ejercicioInterfazFuncionalLibreria.test;

import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import ejercicioInterfazFuncionalLibreria.models.Cliente;
import ejercicioInterfazFuncionalLibreria.models.Libro;
import ejercicioInterfazFuncionalLibreria.models.Venta;

public class LibreriaService {
    public static void main(String[] args) {
        Predicate<Cliente> clienteValido = cliente -> cliente.getEdad() >= 18;

        BiFunction<Cliente, Libro, String> generarFactura = (cliente, libro) -> "---Factura---\n" + "Cliente: "
                + cliente.getNombre() + "\n" + "Compra: " + libro.getTitulo() + "\n" + "Costo: " + libro.getPrecio()
                + "\n"+ "Fecha: " + LocalDate.now();

        BiConsumer<Cliente, Libro> notificarCompra = (cliente, libro) -> System.out.println(
                "Notificación enviada a " + cliente.getNombre() + ": por comprar " + libro.getTitulo());

        Supplier<String> generarCodigoVenta = () -> UUID.randomUUID().toString();

        UnaryOperator<Double> aplicarDescuento = precio -> precio * 0.9;

        Libro libro1 = new Libro("Los Ojos de plata", "Scott Cawthon", LocalDate.of(2021, 1, 1), 305);
        Libro libro2 = new Libro("Metro 2033 ", "Dmitry Glukhovsky", LocalDate.of(2022, 10, 31), 450);

        Cliente cliente1 = new Cliente("Ana", 20);
        Cliente cliente2 = new Cliente("Saul", 17);
        Cliente cliente3 = new Cliente("Cristian", 35);
        System.out.println("----Validar edad del cliente-----");

        if (clienteValido.test(cliente2)) {
            System.out.println("El cliente es mayor de edad");
        } else {
            System.out.println("El cliente no es mayor de edad");
        }
        
        Venta venta1 = new Venta(cliente3, libro1, LocalDate.now());
        Venta venta2 = new Venta(cliente3, libro2, LocalDate.now());

        cliente3.agregarVenta(venta1);
        cliente3.agregarVenta(venta2);

        System.out.println(generarFactura.apply(cliente3, libro1));

        System.out.println("----Notificación-----");
        notificarCompra.accept(cliente1, libro2);
        System.out.println("----Código de venta-----");
        System.out.println("Código: " + generarCodigoVenta.get());
        System.out.println("----Descuento----");
        System.out.println("Aplicar descuento 10% para el libro " + libro1.getTitulo() + ", precio final: $" + aplicarDescuento.apply(libro1.getPrecio()));

        // List<Venta> nuevo = new ArrayList<>(cliente3.getHistorialCompras());

        // for (Venta venta : nuevo) {
        //     System.out.println(venta);
        // }

    }
}
