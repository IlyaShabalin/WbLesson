package oop.inheritans.lesson9.Dogs;

import oop.inheritans.lesson9.Alive;

public abstract class Dog  extends Alive {

    protected final int countLegs = 4;
    public int countTeeth;

    public static final String LATIN_NAME = "Canis familiaris";

    public Dog(int countTeeth) {this.countTeeth = countTeeth;}

    public void bark(){System.out.println("Собака громко лает!");}

    public final void eat(){System.out.println("Собака ест");}

    public void beAngry(){System.out.println("Собака рычит");}

    //Порода собак
    public abstract void dogBreed();
    //Скорость бега собак
    public abstract void run();
    //Вес собаки
    public abstract void weightDogs ();
}
