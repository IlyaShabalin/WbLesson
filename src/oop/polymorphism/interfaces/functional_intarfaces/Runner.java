package oop.polymorphism.interfaces.functional_intarfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();cat.makeSound();

        Sounding bird = () -> System.out.println("Птица поет");
        bird.makeSound();
    }
}
