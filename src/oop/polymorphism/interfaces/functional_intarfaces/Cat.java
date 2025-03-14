package oop.polymorphism.interfaces.functional_intarfaces;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Cat мяукает");
    }
}
