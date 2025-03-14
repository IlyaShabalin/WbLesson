package oop.class_object.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Задача:
        //Составить справочник стран, которым можно пользоваться в любом классе
        //Япония: население 140млн, язык японский
        //Греция: население 10млн, язык греческий
        //Аргентина: население 47млн, язык испанский
        System.out.println(Arrays.toString( Country.values()));
        System.out.println(Country.valueOf("JAPAN").getPeopleCount());
    }
}
