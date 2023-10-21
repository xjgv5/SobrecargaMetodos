package com.xjgv.poosobrecarga;

public class Calculadora {
    public int suma(int a, int b){
        return a+b;
    }

    public int suma(int... argumentos){
        int total = 0;
        for (int i: argumentos){
            total+=i;
        }
        return total;
    }

    public float suma(float a, int... argumentos){
        float total = a;
        for (int i: argumentos){
            total+=i;
        }
        return total;
    }

    public float suma(float a, float b){
        return a + b;
    }

    public float suma(int a, float b){
        return a + b;
    }

    public  float suma (float a, int b){
        return  a+ b;
    }

    public  double suma(double a, double b){
        return a + b;
    }

    public  long suma(long a, long b){
        return a + b;
    }

    public int suma(String a, String b){
        int resultado;
        try{
            resultado =  Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }

    public int suma(int a, int b, int c){
        return a + b + c;
    }
}
