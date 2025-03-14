package oop.polymorphism.interfaces.basics;

public class Car implements Moveable{
    public void move() {
        System.out.println("Машина едет");
    }
    public void turnOff(){
        System.out.println("Off car");
    }

    @Override
    public void back() {
        System.out.println("Back return");
    }
}
