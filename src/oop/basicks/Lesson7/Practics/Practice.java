package oop.basicks.Lesson7.Practics;

public class Practice {
    public static void main(String[] args) {


//    Долой отечественный автопром, сделаем машину сами!
//    1. Создать класс машина с атрибутами "марка", "максимальная скорость". По умолчанию скорость 220.
//    2. Создать конструкторы: на атрибут марка, на атрибуты "марка" и максимальная скорость
//    3. Создать метод "разгон до 100": напечатать на экран "Скорость разгона до 100км/ч:[значение]"
//    значение получаем по формуле: 110/(максимальная скорость машины / 20).
//
//    1.1 Создать объект класса Машина здесь и через сеттер установить значение "ZvorykinCar"
//    1.2 Создать объект класса Машина здесь и через сеттер установить значение "SuperCar",400

        Car zvorykinCar = new Car("ZvorykinCar");

        Car supperCar = new Car("SupperCar", 400);

//
//    1.3 Создать класс гараж, рассчитанный на две машины. При создании гараж пустой.
//    1.4 Создать сеттеры на две машины в гараже
//    1.5 Создать метод "дай информацию о машинах": Печатает на экран Имя бренда + вызов метода "разгон до 100".

        Garage garage = new Garage();
        garage.setCar1(zvorykinCar);
        garage.setCar2(supperCar);
        garage.getInfoAboutCars();
    }
}

