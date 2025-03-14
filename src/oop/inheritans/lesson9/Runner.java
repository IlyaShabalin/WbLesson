package oop.inheritans.lesson9;

import oop.inheritans.lesson9.Dogs.Pudel;
import oop.inheritans.lesson9.Dogs.Shepherd;
import oop.inheritans.lesson9.Dogs.Terier;

public class Runner {
    public static void main(String[] args) {



        System.out.println("INFO Pudel");
        //Пудель
        Pudel pudel = new Pudel();
        pudel.bark();
        pudel.run();
        pudel.dogBreed();
        pudel.weightDogs();
        pudel.breath();
        System.out.println(pudel.countTeeth+"\n");

        System.out.println("Info Shepherd \n");

        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.dogBreed();
        shepherd.weightDogs();
        shepherd.breath();
        shepherd.beAngry();
        System.out.println(shepherd.countTeeth+"\n");

        System.out.println("INFO Terier\n");

        //Терьер
        Terier terier = new Terier();
        terier.bark();
        terier.run();
        terier.dogBreed();
        terier.weightDogs();
        terier.breath();
        System.out.println(terier.countTeeth);
    }
}
