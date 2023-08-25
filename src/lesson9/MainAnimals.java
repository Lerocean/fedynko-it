package lesson9;

import java.util.ArrayList;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class MainAnimals {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList (
        new Animal("tiger", 8),
        new Animal("fox", 3),
        new Animal("beaver", 1),
        new Animal("lion", 7),
        new Animal("camel", 5),
        new Animal("panda", 2),
        new Animal("kangaroo", 9),
        new Animal("monkey", 4),
        new Animal("giraffe", 10),
        new Animal("wolf", 6)
        );

        String result = animals.stream()
                .map(animal -> animal.getName() + " " + animal.getAge() + " years")
                .reduce((a, b) -> a + ", " + b)
                .orElse("");

        System.out.println(result);

    }
}
