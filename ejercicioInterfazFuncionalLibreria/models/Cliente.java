package ejercicioInterfazFuncionalLibreria.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private int edad;
    private List<Venta> historialCompras;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.historialCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Venta> getHistorialCompras() {
        return historialCompras;
    }

    public void agregarVenta(Venta v) {
        historialCompras.add(v);
    }

    @Override
    public String toString() {
        return "{nombre: " + nombre +
                ", edad: " + edad + "}";
    }

}