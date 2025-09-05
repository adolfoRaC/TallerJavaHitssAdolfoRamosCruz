package clases;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private final int id;
    private String nombre;
    private double saldo;

    private static int contador;

    private List<Transaccion> transacciones;

    public CuentaBancaria(String nombre, double saldo) {
        this.id = ++contador;
        this.nombre = nombre;
        this.saldo = saldo;
        this.transacciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        transacciones.add(new Transaccion("deposito", monto, contador));
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            transacciones.add(new Transaccion("Retiro", monto, contador ));
        } else {
            System.out.println("Saldo insuficiente en cuenta " + nombre);
        }
    }

    public void historial() {
        double deposito = 0;
        double retiro = 0;

        for (Transaccion transaccion : transacciones) {
            if (transaccion.getTipoOperacion().toLowerCase() == "deposito") {
                deposito += transaccion.getMonto();
            } else {
                retiro += transaccion.getMonto();
            }
        }
        System.out.println(nombre + " deposita $" + deposito + " y retiro $" + retiro);
    }

    @Override
    public String toString() {
        return "{ id: " + id + 
        ", nombre: " + nombre + 
        ", saldo: " + saldo + 
        // ", transacciones: " + transacciones + 
        "}";
    }

}
