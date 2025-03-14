package oop.basicks.Lesson7;

import java.util.Arrays;

public class cat {
    //Атрибуты(свойства,поле)
    public String color;
    double weight;
    String ownerName;

    // Конструктор
    public cat (String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }
    //уничтожение дивана
    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот царапает диван %s\n",sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "С охоты Кот принес - Мышь";
        }
            return "С охоты кот принес - Сова";
    }

    public String hunt(boolean isDay, boolean success){
        if (success){
        if (isDay) {
            return "С охоты Кот принес - Мышь";
        }
        return "С охоты кот принес - Сова";
       }
        return "Ничего не поймал";
    }

    public void feed (String giver ,String ...product){
        System.out.printf("Человек %s дает еду.Кот поел: %s\n",giver, Arrays.toString(product));

    }


    //Перегрузка (overloading) метода hunt

    public void hunt (String timesOfDay){
        if ( timesOfDay.equals("Утро")){
            System.out.println("Мышь");
        }else {
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
