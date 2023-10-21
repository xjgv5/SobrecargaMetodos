package com.xjgv.poosobrecarga;

import static com.xjgv.poosobrecarga.Calculadora.*;

public class EjempploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar enteros : " + suma(10, 5));
        System.out.println("Sumar float :" + suma(10.0f, 5f));
        System.out.println("Sumar float, int : " + suma(4f, 0));
        System.out.println("Sumar int, float : " + suma(21, 12f));
        System.out.println("Sumar double : " + suma(3.12, 4.21));
        System.out.println("Sumar string : " + suma("21", "43"));
        System.out.println("Sumar 3 enteros : " + suma(10, 5, 21));
        System.out.println("Sumar 6 enteros : " + suma(3,2,1,4,2,4));
        System.out.println("Sumar float + n int" + suma(4f + 10, 21, 22, 1, 3, 2));
        System.out.println("Suma long : " + suma(10l, 20L));

    }
}
