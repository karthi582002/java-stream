package com.karthi.examples;


import com.karthi.SouthIndianDataGenerator;
import com.karthi.beans.Car;
import com.karthi.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class StatisticsWithStreams {

    @Test
    public void count() throws Exception {
        List<Car> cars = MockData.getCars();
        Long count = cars.stream().count();
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();
        Car minCar = cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .get();
        System.out.println(minCar);
    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();
        Car maxCar = cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .get();
        System.out.println(maxCar);
    }


    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();
        Double averagePrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0.0);
        System.out.println(averagePrice);
    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();
        Double sum = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        System.out.println(sum);
    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
        DoubleSummaryStatistics stats = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println(stats);
    }

}