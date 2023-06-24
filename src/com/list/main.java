package com.list;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        System.out.println(nombres);

        nombres.add("Diego");
        nombres.add("Diego2");
        nombres.add("Diego3");
        for (String nombre:
             nombres) {
            System.out.println(nombre);
        }

    }
}
