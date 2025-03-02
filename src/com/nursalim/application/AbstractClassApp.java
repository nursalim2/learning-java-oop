package com.nursalim.application;

import com.nursalim.data.Animal;
import com.nursalim.data.City;
import com.nursalim.data.Dog;
import com.nursalim.data.Location;

public class AbstractClassApp {
    public static void main(String[] args) {
//        var location = new Location(); error
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);

        Animal animal = new Dog();
        animal.name = "Doggy";
        animal.run();
    }
}
