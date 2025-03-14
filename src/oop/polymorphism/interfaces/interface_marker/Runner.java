package oop.polymorphism.interfaces.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if(bird instanceof Alive){
            System.out.println("Bird is alive");
        }
        if(airplane instanceof Alive){
            System.out.println("Airplane is alive");
        }
        else {
            System.out.println("Airplane is not alive");
        }
    }
}
