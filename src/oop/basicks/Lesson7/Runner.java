package oop.basicks.Lesson7;

import oop.basicks.Lesson7.zoo.Zoo;

public class Runner {
    //экземпляр класса Cat (конкретный кот)
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар", -10, "Petr");
        cat cat = new cat("Black", 10, "Yuri");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
