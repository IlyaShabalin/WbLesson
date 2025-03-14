package oop.basicks.lesson8;

public class Car {
    private String brend;
    public static int countCars = 0;
    public final static String BMW_INFO = "Bmw - немецкая компания,основанная в 1928 году";
    public final static String AUDI_INFO = "Audi - немецкая компания,основанная в 1933 году";
    public final static String KIA_INFO = "Kia - корейская компания,основанная в 1978 году";
    public final static String[] BRAND_DESCRIPTION = new String[3];
    //определяем индекс массива к ИНФО
    static {
        BRAND_DESCRIPTION[0]=BMW_INFO;
        BRAND_DESCRIPTION[1]=AUDI_INFO;
        BRAND_DESCRIPTION[2]=KIA_INFO;
    }

    public Car(String brend) {
        this.brend = brend;
        countCars ++;

    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands(){
        System.out.println("Перечень доступных брендов: BMW, AUDI, KIA");
    }
}
