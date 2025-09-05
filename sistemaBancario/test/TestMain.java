package test;

import clases.CuentaBancaria;

public class TestMain {

    public static void main(String[] args) {

        System.out.println();
        CuentaBancaria cb1 = new CuentaBancaria("Adolfo", 1500);
        CuentaBancaria cb2 = new CuentaBancaria("Ruben", 100);

        System.out.println(cb1);
        System.out.println(cb2);
        
        System.out.println("--------Transacciones--------");

        // Transaccion tr = new Transaccion("deposito", 40, cb2)
        cb1.depositar(100);
        cb1.depositar(10);

        cb1.retirar(50);
        cb1.retirar(20);


        cb2.depositar(5);
        cb2.retirar(15);

        cb1.historial();
        cb2.historial();

        System.out.println("--------Datos de cuenta--------");

        System.out.println(cb1);
        System.out.println(cb2);
    }
}