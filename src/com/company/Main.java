package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Llapis llapis = new Llapis();llapis.setColor();
        Llapis llapis2 = new Llapis();llapis2.setColor();
        Llapis llapis3 = new Llapis();llapis3.setColor();
        Llapis llapis4 = new Llapis();llapis4.setColor();
        Llapis llapis5 = new Llapis();llapis5.setColor();
        Llapis llapis6 = new Llapis();llapis6.setColor();
        Llapis llapis7 = new Llapis();llapis7.setColor();
        Llapis llapis8 = new Llapis();llapis8.setColor();
        Llapis llapis9 = new Llapis();llapis9.setColor();
        Llapis llapis10 = new Llapis();llapis10.setColor();

        List<Llapis> llista_llapis = new ArrayList<>();
        llista_llapis.add(llapis);
        llista_llapis.add(llapis2);
        llista_llapis.add(llapis3);
        llista_llapis.add(llapis4);
        llista_llapis.add(llapis5);
        llista_llapis.add(llapis6);
        llista_llapis.add(llapis7);
        llista_llapis.add(llapis8);
        llista_llapis.add(llapis9);
        llista_llapis.add(llapis10);

        Set<Llapis> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.addAll(llista_llapis);
        llista_llapis.clear();
        llista_llapis.addAll(linkedHashSet);

        Collections.sort(llista_llapis);

        for (Llapis l: llista_llapis) {
            System.out.println("Color: " + l.getColor());
        }

    }
}
