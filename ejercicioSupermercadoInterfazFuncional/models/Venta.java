package ejercicioSupermercadoInterfazFuncional.models;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos = new ArrayList<>();
    private double total;

    public Venta(int id, Cliente cliente, Empleado empleado) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public void agregarVenta(List<Producto> v) {
        productos.addAll(v);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "{id: " + id + ", cliente: " + cliente + ", empleado: " + empleado
                + ", total: " + calcularTotal() + "}";
    }

}
