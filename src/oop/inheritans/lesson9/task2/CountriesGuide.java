package oop.inheritans.lesson9.task2;
//Класс справочник должен иметь 3 страны: Франция, Аргентина, Италия
//Класс Франция имеет 67_000_000 человек, французский язык, континент: Евразия
//Аргентина имеет 47_000_000 человек, испанский язык, континент: Южная Америка
//Италия имеет 58_000_000 человек, итальянский язык, континент: Евразия
public class CountriesGuide {
    public static final Country FRANCE = new Country(67_000_000,"Французский","Евразия");
    public static final Country ARGENTINA = new Country(47_000_000,"Испанский","Южная америка");
    public static final Country ITALY = new Country(58_000_000,"Итальянский","Евразия");

    private CountriesGuide(){}
}
