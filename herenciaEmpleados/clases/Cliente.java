package ejercicio.clases;

public class Cliente extends Persona {
    private Integer clienteId;

    private static Integer contador = 0;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {

        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++contador;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID Cliente: " + clienteId;
    }
}
