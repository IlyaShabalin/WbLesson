package oop.basicks.Lesson7.Practics;
//    1.3 Создать класс гараж, рассчитанный на две машины. При создании гараж пустой.
//    1.4 Создать сеттеры на две машины в гараже
//    1.5 Создать метод "дай информацию о машинах": Печатает на экран Имя бренда + вызов метода "разгон до 100".
public class Garage {
    private Car car1;
    private Car car2;

    public Garage() {
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void getInfoAboutCars() {

        getInfoAboutCar(car1);
        getInfoAboutCar(car2);
    }
    private void getInfoAboutCar(Car car){
        System.out.println(car.getBrand());
        car.investigateSpeed100();
    }
}
