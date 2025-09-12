package ejercicio.clases;

import genericosSupermercado.interfaces.IProducto;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Precio: " + precio;
    }

    
}
