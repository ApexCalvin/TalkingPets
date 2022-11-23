package io.zipcoder.polymorphism.Pets;

public abstract class Pet{
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
