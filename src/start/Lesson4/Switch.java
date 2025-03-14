package start.Lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Понедельник 1 и тд
        System.out.println("Введите число дня недели ");
        int number= new Scanner(System.in).nextInt();
        switch (number){
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("вторник");
            case 3 -> System.out.println("среда ");
            case 4 -> System.out.println("Четверг ");
            case 5 -> System.out.println("Пятница ");
            case 6 -> System.out.println("Суббота ");
            case 7 -> System.out.println("Восскресенье ");
            default -> System.out.println("Данного дня недели не существуе");
        }
    }
}
