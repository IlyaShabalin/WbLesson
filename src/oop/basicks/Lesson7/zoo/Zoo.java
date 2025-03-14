package oop.basicks.Lesson7.zoo;

import oop.basicks.Lesson7.Dog;
import oop.basicks.Lesson7.cat;

public class Zoo {
   private cat cat;
   private Dog dog;

    public Zoo(oop.basicks.Lesson7.cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }
    public void feed(){
        cat.feed("Yori","Рыбу");
        dog.feed("Yuri","Кости");
}
}
