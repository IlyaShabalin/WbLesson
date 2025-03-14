package oop.basicks.Lesson7.Practics;
//    1. Создать класс машина с атрибутами "марка", "максимальная скорость". По умолчанию скорость 220.
//    2. Создать конструкторы: на атрибут марка, на атрибуты "марка" и максимальная скорость
//    3. Создать метод "разгон до 100": напечатать на экран "Скорость разгона до 100км/ч:[значение]"
//    значение получаем по формуле: 110/(максимальная скорость машины / 20).
public class Car {

    private String brand;
    private  int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    public void investigateSpeed100(){
        double speed = 110d/ (this.maxSpeed/20d);
//        110/(максимальная скорость машины / 20).
        System.out.printf("Скорость разгона до 100км/ч : %s \n",speed);
    }

    public String getBrand() {
        return brand;
    }
}


