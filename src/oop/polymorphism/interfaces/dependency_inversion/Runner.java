package oop.polymorphism.interfaces.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Pudel pudel = new Pudel();
        Shephard shephard = new Shephard();
        Terier terier = new Terier();
        DogZoo dogZoo = new DogZoo(terier, shephard);
        DogZoo dogZoo1 = new DogZoo(pudel, shephard);
    }
}
