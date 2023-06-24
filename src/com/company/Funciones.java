package com.company;

public class Funciones {
    public static void main(String[] args) {

        saludo("Diego");
    }

    private static void saludo(String name) {

        System.out.println("Hola" + name);
         int cantidad_maxima = 0 ;
        for (int i=0 ; i<= cantidad_maxima ; i++ ){
            System.out.println(i);
        }

        while ( cantidad_maxima <= 10 ){
            System.out.println(cantidad_maxima);
            cantidad_maxima++;
        }
    }
}
