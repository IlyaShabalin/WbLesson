package start.Lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Илья";
        int age = 24;
        String phrase = String.format("Меня зовут %s.Мне %d года.", name,age);
        System.out.println(phrase);

        //укороченая форма записи !!
        System.out.printf("Меня зовут %s.Мне %d года.",name,age);
    }
}