package lesson9;

import java.util.Map;
import java.util.Set;

public class Animal {
    public String name;
    public int age;

    public static Object values() {
        return null;
    }

    public static Set<Integer> keySet() {
    return null;
    }

    public static Map<String, Animal> stream() {
    return null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }
}