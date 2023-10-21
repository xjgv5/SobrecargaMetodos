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
        System.out.println("Sumar 6 enteros : " + calculadora.suma(3,2,1,4,2,4));
        System.out.println("Sumar float + n int"+ calculadora.suma(4f + 10, 21, 22, 1, 3, 2));
        System.out.println("Suma long : " + calculadora.suma(10l, 20L));

    }
}
