package start.Lesson4;

import java.util.Scanner;

public class PracticSwitch {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        int numb1 = new Scanner(System.in).nextInt();
        System.out.println("Введите действие ");
        String action = new Scanner(System.in).nextLine();
        System.out.println("Введите второе число");
        int numb2 = new Scanner(System.in).nextInt();
        double res;

        switch (action){
            case "+":
                res=numb1+numb2;
                    System.out.println(res);
                break;
            case "-":
                res=numb1-numb2;
                System.out.println(res);
                break;
            case "*":
                res=numb1*numb2;
                System.out.println(res);
                break;
            case "/":
                res=numb1/numb2;
                System.out.println(res);
                break;
        }
    }
}
