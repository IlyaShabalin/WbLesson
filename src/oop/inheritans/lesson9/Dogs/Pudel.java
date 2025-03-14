package oop.inheritans.lesson9.Dogs;

public class Pudel extends Dog {

    public Pudel(){
        super(28);}

    @Override
    public void weightDogs() {System.out.println("Собака весит 8кг");}

    @Override
    public void dogBreed() {System.out.println("Собака породы - Пудель");}

    @Override
    public void run() {System.out.println("Собака бежит со скоростью 10км/ч");}

    @Override
    public void breath() {System.out.println("Пудель Дышит");}
}
