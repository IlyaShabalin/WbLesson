package oop.inheritans.lesson9.task1;

public class secretary extends OfficeWorker{

    public secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Секретарь получил зарплату 30_000 рублей");
    }
}
