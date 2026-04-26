package com.karthi.examples;

import com.karthi.beans.Car;
import com.karthi.beans.Person;
import com.karthi.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    @Test
    public void sortingSteamOfElements() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .toList();
        System.out.println(sortedPeople);
    }

    @Test
    public void sortingSteamOfElementsReverse() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .toList();
        System.out.println(sortedPeople);
    }

    @Test
    public void sortingSteamOfObjets() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> sortedPeople = people.stream()
                .sorted(
                        Comparator.comparing(Person::getFirstName)
                                .thenComparing(Person::getAge)
                ).toList();
        System.out.println(sortedPeople);
    }

    @Test
    public void topTenMostExpensiveBlueCars() throws IOException {
        // here we need to get the top 10  of price of car  and color of Blue
//        need to use sorting limit and filter
        List<Car> cars = MockData.getCars();

        List<Car> mostExpensiveBlueCars = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("blue"))
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(10)
                .toList();
        mostExpensiveBlueCars.forEach(System.out::println);
    }

}
