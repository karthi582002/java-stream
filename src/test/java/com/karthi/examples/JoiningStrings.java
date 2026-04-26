package com.karthi.examples;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {

    @Test
    public void joiningStrings() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"

        StringBuilder stringBuilder =  new StringBuilder();
        for (String name : names) {
            String formatted = name.substring(0,1).toUpperCase() + name.substring(1);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(formatted);
        }
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void joiningStringsWithStream() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"

        String result = names.stream()
                .map(name -> name.substring(0,1).toUpperCase()+ name.substring(1))
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }

}
