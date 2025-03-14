package oop.polymorphism.interfaces.intarface_inheritance;

public interface Moveable {
    void move();

    default void eat(){
        System.out.println("Moving eating...");
    }
}
