package ejercicio.impl;

import genericosSupermercado.clases.Electronico;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() +  getPrecio() * 0.1;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pulgada: " + pulgada;
    }
    
}
