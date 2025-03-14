package oop.inheritans.lesson9.Dogs;

public class Terier extends Dog {

    public Terier() {
        super(27);
    }

    @Override
    public void dogBreed() {System.out.println("Собака породы - Терьер");}

    @Override
    public void run() {System.out.println("Бежит");}

    @Override
    public void weightDogs() {System.out.println("Собака весит 7 кг");}

    @Override
    public void breath() {System.out.println("Терьер дышит");}
}
