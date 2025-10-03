package ejercicioInventarioTiendaDeportes.models;

import ejercicioInventarioTiendaDeportes.enums.Categoria;

public class Producto {
    private String codigo;
    private String nombre;
    private Categoria categoria;
    private int stock;

    public Producto(String codigo, String nombre, Categoria categoria, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{codigo: " + codigo +
                ", nombre: " + nombre +
                ", categoria: " + categoria +
                ", stock: " + stock
                + "}";
    }

}
