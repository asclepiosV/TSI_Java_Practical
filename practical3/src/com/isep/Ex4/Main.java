package com.isep.Ex4;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a1");
        list.add("c3");
        list.add("a2");
        list.add("a3");
        list.add("b3");
        list.add("b2");
        list.add("c1");
        list.add("c2");
        list.add("b1");
        list.stream()
                .filter(item -> item.substring(0,1).matches("c"))
                .map(item -> item.toUpperCase(Locale.ROOT))
                .sorted()
                .forEach(System.out::println);
}}
