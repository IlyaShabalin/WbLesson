package oop.inheritans.lesson9.task1;

public class Finansist extends OfficeWorker{
    public Finansist(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получил 50_000 рублей");
    }
}
