package oop.inheritans.lesson9.task2;

public class Task {
    public static void main(String[] args) {
        //Создать справочник стран
        //Класс справочник должен иметь 3 страны: Франция, Аргентина, Италия
        //Класс Франция имеет 67_000_000 человек, французский язык, континент: Евразия
        //Аргентина имеет 47_000_000 человек, испанский язык, континент: Южная Америка
        //Италия имеет 58_000_000 человек, итальянский язык, континент: Евразия
        //При получении страны из справочника, мы можем получить каждый атрибут по отдельности
        Country france = CountriesGuide.FRANCE;
        System.out.println(france.getContinent());
        Country argentina = CountriesGuide.ARGENTINA;
        System.out.println(argentina.getCountPeoples());
    }
}
