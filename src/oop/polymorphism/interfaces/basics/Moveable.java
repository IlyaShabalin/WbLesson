package oop.polymorphism.interfaces.basics;
//все методы в интерфейсе публичны public

public interface Moveable {
    void move();

    default void back (){
        System.out.println("Back upp");
    }
}
