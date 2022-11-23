package io.zipcoder.polymorphism.Pets;

public class Cat extends Pet{
    public Cat(String name) {

        super(name);
    }

    public Cat() {

        super("");
    }

    public String speak() {
        return "Meow?";
    }
}
