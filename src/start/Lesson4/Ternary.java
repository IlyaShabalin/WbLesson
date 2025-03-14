package start.Lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int bredPrice = 20;
        int moneyAfterShoping = money - bredPrice;
        int childMoney = moneyAfterShoping >= 50 ? 10 : 5;
        moneyAfterShoping -=childMoney;
        System.out.println(childMoney);
        System.out.println(moneyAfterShoping);
    }
}
