package ejercicio.clases;

import genericosSupermercado.interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fabricante: " + fabricante;
    }

    
    
}
