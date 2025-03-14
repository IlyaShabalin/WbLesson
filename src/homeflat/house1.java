package homeflat;

public class house1 {
    public static void main(String[] args) {
        Home house1 = new Home("Москва","Дом",90,2);
        System.out.println(house1);

        house1.Price();
        house1.PriceofCredit();
    }
}
