package oop.inheritans.lesson9.Dogs;

//овчарка
public final class Shepherd extends Dog {

    public Shepherd() {
        super(28);}

    @Override
    public void weightDogs() {System.out.println("Собака весит 12кг");}

    @Override
    public void dogBreed() {System.out.println("Собака породы - Овчарка");}

    @Override
    public void run() {System.out.println("Собака бежит со скоростью 15км/ч");}

    @Override
    public void breath() {System.out.println("Овчарка дышит");}

    public void bark(){System.out.println("Овчарка громко лает");}


    @Override
    public void beAngry(){
        //Текст из своего метода
        //вызывала бы метод родителя
        //текст из своего метода
        System.out.println("Собака стоит на "+super.countLegs+".");
        System.out.println("Овчарка увидела чужого человека ");
        super.beAngry();
        System.out.println("Овчарка успокоилась");

        //Овчарка увидела чужого человека
        //Собака рычит
        //Овчарка успокоилась
    }
}
