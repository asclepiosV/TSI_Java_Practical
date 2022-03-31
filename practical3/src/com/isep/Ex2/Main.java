package com.isep.Ex2;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listUpper = new ArrayList<>();
        listUpper.add("a1");
        listUpper.add("c3");
        listUpper.add("a2");
        listUpper.add("a3");
        listUpper.add("b3");
        listUpper.add("b2");
        listUpper.add("c1");
        listUpper.add("c2");
        listUpper.add("b1");
        listUpper.stream()
                .map(item -> item.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);
    }
}
