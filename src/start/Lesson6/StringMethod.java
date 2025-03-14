package start.Lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello World!";
        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLover = text.toLowerCase();
        System.out.println(textLover);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        //Замена всех кусков текста на другой
        String replaceText = text.replaceAll("r", "a");
        System.out.println(replaceText);

        //Повторить текст n раз
        String repeated = text.repeat(10);
        System.out.println(repeated);

        //Разбить текст на массив String
        String names = "Yuri;Olga;Petr;Vasya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Конкатенация
        String word1 = "hi";
        String word2 = "Friend";
        String result = word1+word2;
        System.out.println(result);

        //Начинается на подстроку
        boolean hell = text.startsWith("Hell");
        System.out.println(hell);

        //Заканчивается на подстроку
        boolean world = text.endsWith("World!");
        System.out.println(world);

        //Обрезка строки(первые 5 символов)
        String substring = text.substring(0, 5);
        System.out.println(substring);

        int length1 = "hello".replaceAll("l", "a").toUpperCase().length();
        System.out.println(length1);


    }
}
