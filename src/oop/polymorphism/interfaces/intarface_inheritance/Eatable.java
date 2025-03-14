package oop.polymorphism.interfaces.intarface_inheritance;

public interface Eatable {
   default void eat(){
       System.out.println("Eating...");
   }
}
