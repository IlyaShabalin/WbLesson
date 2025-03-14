package homeflat;

public class Flat {
    public static void main(String[] args) {
        Home flat1 = new Home("Ростов-на-Дону","Квартира",56,3);
        System.out.println(flat1);
        flat1.Price();
        flat1.PriceofCredit();
    }
}
