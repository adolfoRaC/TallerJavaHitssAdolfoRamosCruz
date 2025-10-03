package ejercicioSupermercadoInterfazFuncional.models;

import ejercicioSupermercadoInterfazFuncional.enums.TipoCliente;

public class Cliente {
    private int id;
    private String nombre;
    private TipoCliente tipoCliente;
    
    public Cliente(int id, String nombre, TipoCliente tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        return "{id: " + id + ", nombre: " + nombre + ", tipoCliente: " + tipoCliente + "}";
    }

    
}
