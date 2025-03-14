package oop.class_object.equals_hascode_practice;

public class Task {
    public static void main(String[] args) {
        //Задача
        //Создать класс пользователь (логин, пароль).
        //Создать два пользователя:
        //1-login : shabalin , pass: 1111111
        //2- login :shabalin , pas: 222222
        //сделать так чтобы хэшкоды этих объектов были равны, но equals возвращал false( т/е объекты не равны)

        User user1 = new User("shabalin","111111");
        User user2 = new User("shabalin","222222");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
