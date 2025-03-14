package oop.polymorphism.interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

//        dog.move();
//        car.move();

        Moveable[] moveables = new Moveable[2];
        moveables[0] = car;
        moveables[1] = dog;

        for (Moveable moveable : moveables) {
            moveable.move();
            moveable.back();
        }
    }
}
