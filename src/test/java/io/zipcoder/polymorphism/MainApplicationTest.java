package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Fish;
import io.zipcoder.polymorphism.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MainApplicationTest {

    @Test
    public void cat_construct_test(){
        Cat cat = new Cat("cat");
        String actual = cat.speak();
        String expected = "Meow?";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cat_nullary_test(){
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "Meow?";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dog_construct_test(){
        Dog dog = new Dog("dog");
        String actual = dog.speak();
        String expected = "Woof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dog_nullary_test(){
        Dog dog = new Dog();
        String actual = dog.speak();
        String expected = "Woof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fish_construct_test(){
        Fish fish = new Fish("fish");
        String actual = fish.speak();
        String expected = "Blub blub...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fish_nullary_test(){
        Fish fish = new Fish();
        String actual = fish.speak();
        String expected = "Blub blub...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createValidPet_cat_test(){
        Cat cat = (Cat) MainApplication.createValidPet("cat", "cat");
        String actual = cat.speak();
        String expected = "Meow?";
        Assert.assertEquals(expected, actual);
    }

    public void createValidPet_dog_test(){
        Dog dog = (Dog) MainApplication.createValidPet("dog", "DOG");
        String actual = dog.speak();
        String expected = "Woof!";
        Assert.assertEquals(expected, actual);
    }

    public void createValidPet_fish_test(){
        Fish fish = (Fish) MainApplication.createValidPet("fish", "Fish");
        String actual = fish.speak();
        String expected = "Blub blub...";
        Assert.assertEquals(expected, actual);
    }
}
