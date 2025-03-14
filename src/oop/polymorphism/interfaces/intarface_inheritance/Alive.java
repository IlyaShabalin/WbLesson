package oop.polymorphism.interfaces.intarface_inheritance;

public interface Alive extends Eatable,Moveable{
    @Override
    default void eat() {
        Moveable.super.eat();

    }
}
