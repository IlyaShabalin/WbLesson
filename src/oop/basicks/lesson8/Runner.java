package oop.basicks.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        Car bmw = new Car("bmw");
        Car kia = new Car("kia");
        System.out.println("Количество машин: "+ Car.countCars);

        Car.printBrands();
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTION));

    }
}
