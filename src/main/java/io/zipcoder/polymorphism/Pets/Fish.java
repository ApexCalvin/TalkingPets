package io.zipcoder.polymorphism.Pets;

public class Fish extends Pet{

    public Fish(String name) {

        super(name);
    }

    public Fish() {

        super("");
    }

    public String speak() {

        return "Blub blub...";
    }
}
