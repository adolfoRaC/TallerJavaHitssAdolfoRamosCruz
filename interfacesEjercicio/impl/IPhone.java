package ejercicio.impl;

import ejercicio.clases.Electronico;

public class IPhone extends Electronico {
    private String modelo;
    private String color;
    
    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() + getPrecio() * 0.16; 
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modelo: " + modelo + ", Color: " + color;
    }

    
}
