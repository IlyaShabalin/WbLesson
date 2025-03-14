package oop.basicks.lesson8.task;

public class Task {
    //Создать сеть ресторанов, которая обладает общими, для всех ресторанов, запасами продуктов: сосиски, хлеб.
    //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
    //Если сосисок и хлеба не хватает, тогда на экран: нет ингредиентов!
    //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
    //Запасы продуктов должны быть скрыты от чужих глаз.
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        restaurant1.cookHotDog();
        restaurant2.addProduct();
        restaurant1.cookHotDog();
    }
}
