package start.Lesson6;

public class MyString {
    public static void main(String[] args) {
        String text1= new String("\thello");
        String text2 = new String("hello");
        //сравниаваем тексты с помощью equals
        //Даже табуляция влияет на рассхождение
        System.out.println(text1.equals(text2));

        System.out.println(text1);
        System.out.println(text2);
    }
}
