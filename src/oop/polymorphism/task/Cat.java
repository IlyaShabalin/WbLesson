package oop.polymorphism.task;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Кот ест");
    }
    public void bark (){
        System.out.println("собака гавкает");
    }
}
