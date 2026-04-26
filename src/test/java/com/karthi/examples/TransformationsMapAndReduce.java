package com.karthi.examples;

import com.karthi.beans.Car;
import com.karthi.beans.Person;
import com.karthi.beans.PersonDTO;
import com.karthi.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
        List<PersonDTO> personDTOS = people.stream()
                .map(p -> {
                    return new PersonDTO(p.getId(),p.getFirstName(),p.getAge());
                }).toList();
        personDTOS.forEach(System.out::println);

    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

