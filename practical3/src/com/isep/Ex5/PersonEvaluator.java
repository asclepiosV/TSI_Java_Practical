package com.isep.Ex5;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonEvaluator {
    final List<Person> persons;

    public PersonEvaluator(List<Person> personnes) {
        this.persons = personnes;
    }

    void findAndPrint(){
        persons.stream()
                .filter(person -> person.name.startsWith("P"))
                .forEach(System.out::println);
    }

    void groupAndPrint(){
        persons.stream()
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

    void groupByAge(){
        var updatedList = persons.stream()
                .collect(Collectors.groupingBy(person -> person.age));
        updatedList.entrySet().stream()
                        .forEach(entry -> {
                            System.out.println("Age " + entry);
                        });
    }

    void getAverageAge(){
        persons.stream()
                .mapToDouble(persons -> persons.age)
                .average()
                .ifPresent(avg -> System.out.println("\nAverage age is : " + avg));
    }

}
