package com.karthi.examples;

import org.junit.jupiter.api.Test;

import java.util.List;

public class WorkingWithStreams {

    @Test
    void steams() {
        List<String> names = List.of("Tech Panda","Anu Radha", "Gopal", "Karthik","Anusha","Anu","Arun");
        names.stream()
                .filter(name -> name.startsWith("A"))   // filter names starting with A
                .map(String::toUpperCase)               // convert to uppercase
                .sorted()                               // sort alphabetically
                .forEach(System.out::println);          // print

    }
}
