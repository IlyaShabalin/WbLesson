package start.Lesson5;

import java.util.Scanner;

public class Practic2 {
    public static void main(String[] args) {
        System.out.println("Введите ваше число ");
        int number=new Scanner(System.in).nextInt();
        if (number %2 ==0){
            System.out.println("Вы ввели четное число ");
        }else {
            System.out.println("Вы ввели не четное чилос ");
        }
    }
}
