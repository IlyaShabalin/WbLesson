package oop.inheritans.lesson9.task1;

public class Securyty extends Humen {
    public Securyty(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 15_000 рублей ");
    }
}
