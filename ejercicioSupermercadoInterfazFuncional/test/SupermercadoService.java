package ejercicioSupermercadoInterfazFuncional.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import ejercicioSupermercadoInterfazFuncional.models.Venta;
import ejercicioSupermercadoInterfazFuncional.enums.TipoCliente;
import ejercicioSupermercadoInterfazFuncional.models.Cliente;
import ejercicioSupermercadoInterfazFuncional.models.Empleado;
import ejercicioSupermercadoInterfazFuncional.models.Producto;

public class SupermercadoService {
    public static void main(String[] args) {
        Consumer<List<Producto>> validarStock = productos -> {
            for (Producto producto : productos) {
                if (producto.getStock() < 5) {
                    System.out.println("Producto con bajo stock: " + producto);
                }
            }
        };

        Function<List<Producto>, Double> calcularTotal = productos -> {
            double total = 0;
            for (Producto producto : productos) {
                total += producto.getPrecio();
            }
            return total;
        };

        Consumer<Venta> detallesVenta = venta -> {
            System.out.println("---Detalle de la venta---");
            System.out.println("Cliente: " + venta.getCliente().getNombre());
            System.out.println("Menbrecia: " + venta.getCliente().getTipoCliente());
            System.out.println("Empleado: " + venta.getEmpleado().getNombre());
            venta.getProductos()
                    .forEach(producto -> System.out.println(producto));

        };

        Supplier<Producto> generarProducto = () -> new Producto(5, "Jabón de baño", 12.0, 11);

        UnaryOperator<Double> aplicarDescuento = precio -> precio * 0.9;

        Function<List<Producto>, Producto> productoMasCaro = productos -> {
            Producto productoCaro = productos.get(0);
            for (Producto producto : productos) {
                if (producto.getPrecio() > productoCaro.getPrecio()) {
                    productoCaro = producto;
                }
            }
            return productoCaro;
        };

        Predicate<Venta> verificarDescuentoVIP = venta -> {
            if (venta.getCliente().getTipoCliente() == TipoCliente.VIP && venta.calcularTotal() > 1000) {
                return true;
            } else {
                return false;
            }
        };

        Consumer<Venta> ticketVenta = venta -> {
            System.out.println("====Ticket====");
            System.out.println("Cliente: " + venta.getCliente().getNombre());
            System.out.println("Menbrecia: " + venta.getCliente().getTipoCliente());
            System.out.println("Empleado: " + venta.getEmpleado().getNombre());
            venta.getProductos()
                    .forEach(producto -> System.out.println(producto.getNombre() + " - $" + producto.getPrecio()));
            System.out.println("Total: $" + venta.calcularTotal());

        };

        Function<Venta, String> notificarCompra = venta -> "Notificación: " + venta.getCliente().getNombre()
                + " su compra fue realizada con éxito";

        // ---------------------

        Cliente cliente1 = new Cliente(1, "Carlos", TipoCliente.VIP);
        Empleado empleado1 = new Empleado(1, "Luis", "Cajero");

        // Punto 1
        System.out.println("----Productos con bajo stock----");
        List<Producto> productos = List.of(
                new Producto(1, "Leche", 20.5, 3),
                new Producto(2, "Pan", 15.0, 10),
                new Producto(3, "Huevos", 30.0, 2),
                new Producto(4, "Arroz", 25.0, 8),
                new Producto(7, "Carne Kobe", 1250.0, 1));

        validarStock.accept(productos);

        // Punto 2
        System.out.println("----Calcular total de la venta----");
        Venta venta = new Venta(1, cliente1, empleado1);
        venta.agregarVenta(productos);
        System.out.println("Total de la venta: $" + calcularTotal.apply(venta.getProductos()));

        // Punto 3
        detallesVenta.accept(venta);

        // Punto 4
        System.out.println("----Generar producto----");
        System.out.println("Producto generado: " + generarProducto.get());

        // Punto 5
        System.out.println("----Aplicar descuento----");
        System.out.println("Aplicar descuento 10%: " + productos.get(2).getNombre() + ", precio final: $"
                + aplicarDescuento.apply(productos.get(2).getPrecio()));

        // Punto 6
        System.out.println("----Devolver producto más caro----");
        System.out.println("Producto más caro: " + productoMasCaro.apply(productos));

        // Punto 7
        System.out.println("----Verificar descuento VIP----");
        System.out.println(verificarDescuentoVIP.test(venta)
                ? "El cliente: " + venta.getCliente().getNombre() + " tiene descuento VIP"
                : "El cliente: " + venta.getCliente().getNombre() + " no aplica para un descuento VIP");
        // Punto 8
        System.out.println("----Imprimir ticket de venta----");
        ticketVenta.accept(venta);

        // Punto 9
        System.out.println("----Notificar compra----");
        System.out.println(notificarCompra.apply(venta));
    }
}
