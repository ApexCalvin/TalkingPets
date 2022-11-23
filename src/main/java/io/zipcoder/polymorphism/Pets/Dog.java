package io.zipcoder.polymorphism.Pets;

public class Dog extends Pet{
    public Dog(String name) {

        super(name);
    }

    public Dog() {

        super("");
    }
    public String speak() {

        return "Woof!";
    }
}
