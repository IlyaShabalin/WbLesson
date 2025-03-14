package oop.inheritans.lesson9.task1;

public abstract class OfficeWorker extends Humen{
    public OfficeWorker(boolean isMan) {
        super(isMan);
    }
    public void drinkCoffee() {
        System.out.println("Офисный работник пьет кофе");
    }
}
