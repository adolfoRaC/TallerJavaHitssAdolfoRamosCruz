package ejercicioInterfazFuncionalLibreria.models;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Libro libro;
    private LocalDate fechaCompra;

    public Venta(Cliente cliente, Libro libro, LocalDate fechaCompra) {
        this.cliente = cliente;
        this.libro = libro;
        this.fechaCompra = fechaCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    @Override
    public String toString() {
        return "{cliente: " + cliente +
                ", libro: " + libro +
                ", fechaCompra: " + fechaCompra + "}";
    }

}
