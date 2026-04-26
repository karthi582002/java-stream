package com.karthi.examples;



import com.karthi.beans.Car;
import com.karthi.mockdata.MockData;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingData {

    @Test
    public void simpleGrouping() throws Exception {
        List<Car> cars = MockData.getCars();
        Map<String,Long> result = cars.stream()
                .collect(Collectors.groupingBy(
                        car -> car.getColor(),
                        Collectors.counting()
                ));
        result.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    @Test
    public void groupingAndCounting() throws Exception {
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammad",
                "Mohammad",
                "Vincent",
                "Alex",
                "Alex"
        );

        Map<String,Long> result = names.stream()
                .collect(Collectors.groupingBy(
                        name -> name,
                        Collectors.counting()
                ));
        System.out.println(result);
    }

}