package oop.basicks.lesson8.task;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;


    //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
    //Если сосисок и хлеба не хватает, тогда на экран: нет ингредиентов!

    public void cookHotDog(){
        if(sausageCount > 0 && breadCount > 1){
            sausageCount--;
            breadCount -= 2;
            System.out.println("HotDog  готов");
        }else {
            System.out.println("Нет ингредиентов");
        }
    }
    //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
    //Запасы продуктов должны быть скрыты от чужих глаз.

    public void addProduct(){
        sausageCount += 100;
        breadCount +=200;
        System.out.println("Ресторан принял партию товаров");
    }

}
