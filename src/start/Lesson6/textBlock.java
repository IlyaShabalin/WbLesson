package start.Lesson6;

import java.util.Scanner;

public class textBlock {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя ");
       String  name1 =new Scanner(System.in).nextLine();
        System.out.println("Введите имя Друга");
        String name2 = new Scanner(System.in).nextLine();

//        String name1 = "Илья";
//        String name2 ="Вова";
        String text = """
                Привет %s ,я знаю что у тея есть друг по имени %s
                Меня зовут "MacBookAir".Я был выпущен в 2013 году
                И я хочу сказать,что у меня потрясающий хозяин)
                А ты какого года рождения ?
                """.formatted(name1,name2);
        System.out.println(text);
        System.out.println("Введите ваш год рождения ");
        int year = new Scanner(System.in).nextInt();
        String text2 = """
                Приятно познакомится %s
                Получается ты %d года и ты старше меня!              
                """.formatted(name1,year);
        System.out.println(text2);
    }
}
