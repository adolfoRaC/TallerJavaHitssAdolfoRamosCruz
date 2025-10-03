package ejercicioInterfazFuncionalLibreria.models;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private double precio;

    public Libro(String titulo, String autor, LocalDate fechaPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "{titulo: " + titulo +
                ", autor: " + autor +
                ", fechaPublicacion: " + fechaPublicacion +
                ", precio: " + precio + "}";
    }

}
