package com.xjgv.poosobrecarga;

public class EjempploSobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Sumar enteros : " + calculadora.suma(10, 5));
        System.out.println("Sumar float :" + calculadora.suma(10.0f, 5f));
        System.out.println("Sumar float, int : " + calculadora.suma(4f, 0));
        System.out.println("Sumar int, float : " + calculadora.suma(21, 12f));
        System.out.println("Sumar double : " + calculadora.suma(3.12, 4.21));
        System.out.println("Sumar string : " + calculadora.suma("21", "43"));
        System.out.println("Sumar 3 enteros : " + calculadora.suma(10, 5, 21));

        System.out.println("Suma long : " + calculadora.suma(10l, 20L));

    }
}
