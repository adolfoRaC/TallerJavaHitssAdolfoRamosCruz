package clases;


public class Transaccion {

    private final int id;
    private String tipoOperacion;
    private double monto;
    private int idCuentaBancaria;

    private static int contador;

    public Transaccion(String tipoOperacion, double monto, int idCuentaBancaria) {
        this.id = ++contador;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public int getId() {
        return id;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public int getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(int idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    @Override
    public String toString() {
        return "{ id: " + id +
                ", tipoOperacion: " + tipoOperacion +
                ", monto: " + monto + 
                ", idCuentaBancaria: "+ idCuentaBancaria +"}";
    }

}