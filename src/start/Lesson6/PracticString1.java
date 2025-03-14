package start.Lesson6;

import java.util.Arrays;

public class PracticString1 {
    public static void main(String[] args) {
        //выбрать текст начиная с 11 символа до конца строки,перевести в нижний регистр
        //разбить строку на массив по пробелу.Вывести на экран каждое слово из массива и этого слова
        String text = "My name is Giovanni Giorgio";
        String lowerCase = text.substring(11).toLowerCase();
        System.out.println(lowerCase);

        String[] split = text.split(" ");
        System.out.println(Arrays.toString(split));
    }
}
