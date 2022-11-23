package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Fish;
import io.zipcoder.polymorphism.Pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have?: ");
        int numPets = scanner.nextInt();
        scanner.nextLine();
        //forces cursor to the next line, cursor issues per Andrew
        //Pet[] petsOwned = new Pet[numPets];

        ArrayList<Pet> petsOwnedList = new ArrayList<Pet>();

        for(int i = 0 ; i < numPets ; i++) {
            System.out.println("What's the name of pet #"+(i+1)+":");
            String name = scanner.nextLine();
            System.out.println("What's the type of pet #"+(i+1)+":");
            String type = scanner.nextLine();

            petsOwnedList.add(createValidPet(name, type));
        }

        for(Pet pet : petsOwnedList) {
            if (pet != null) {
                System.out.print("\n" + pet.getName() + " says: "+pet.speak());
            }
        }
    }

    public static Pet createValidPet(String name, String type){
        if (type.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (type.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (type.equalsIgnoreCase("fish")) {
            return new Fish(name);
        } else {
            System.out.println("Pet type has not been registered");
            return null;
        }
    }
}
