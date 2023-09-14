package com.systechafrica.part2.casting;

import com.systechafrica.part2.inheritance.animals.Animal;
import com.systechafrica.part2.inheritance.animals.Cat;
import com.systechafrica.part2.inheritance.animals.Dog;

public class CastingDemo {
    public static void main(String[] args) {
        CastingDemo app = new CastingDemo();
        Animal animal = new Dog(); // n1
        Animal animal2 = new Cat(); // n1
        app.printInfo(animal);
        app.printInfo(animal2);
    }

    public void printInfo(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; 
            System.out.println(dog.printName()); 
        }else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            System.out.println(cat.printName()); 
        }

    }
}

/*
 * 
 * public static void main(String[] args) {
 * CastingDemo app = new CastingDemo();
 * Animal animal = new Cat(); //? n1 upcasting -
 * //! we can only access the member variables,methods of animal class
 * app.printInfo(animal);
 * // System.out.println(animal.printName()); // n2 compilation fails as the
 * method is only defined in the subclass
 * 
 * // Dog dog = new Animal(); // compilation dog is not super class to the
 * animal
 * 
 * }
 * public void printInfo(Animal animal) {
 * // System.out.println(animal.printName());
 * Dog dog = (Dog) animal; //downcasting
 * System.out.println(dog.printName()); //
 * 
 * }
 */