package com.karthi.examples;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransformationsWithFlatMap {

    private static final List<List<String>> arrayListOfNames = List.of(
            List.of("Mariam", "Alex", "Ismail"),
            List.of("John", "Alesha", "Andre"),
            List.of("Susy", "Ali")
    );

    @BeforeEach
    void setUp() {
        System.out.println(arrayListOfNames);
    }

    @Test
    public void withoutFlatMap() throws Exception {
        // [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        List<String> names = new ArrayList<>();
        for (List<String> list : arrayListOfNames) {
            for (String name : list) {
                names.add(name);
            }
        }

        System.out.println(names);
    }

    @Test
    public void withFlatMap() throws Exception {
        // [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        List<String> names = arrayListOfNames.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(names);
    }

    @Test
    public void flatMapWithOptionals() {
        List<Optional<String>> optionals = List.of(
                Optional.of("TP"),
                Optional.of("Panda")
        );
        List<String> result = optionals.stream()
                .flatMap(Optional::stream)
                .toList();

        System.out.println(result);
    }
}

