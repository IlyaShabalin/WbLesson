package homeflat;

public class Home {
    String city;
    String houseOfFlat;
    int squareMeters;
    double countRoom;
    int result;

    //вводим конструктор

    public Home(String city, String houseOfFlat, int squareMeters, double countRoom) {
        this.city = city;
        this.houseOfFlat = houseOfFlat;
        this.squareMeters = squareMeters;
        this.countRoom = countRoom;
    }

    //добавляем стринг, для определения аргумента(чтобы нам могли указывать в объекте его свойства в скобках)

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", houseOfFlat='" + houseOfFlat + '\'' +
                ", squareMeters=" + squareMeters +
                ", countRoom=" + countRoom +
                '}';
    }
    public void Price(){
        int result = this.squareMeters*107_000;
        this.result = result;
        System.out.println("Цена выкупа по оценки кв/м : "+ result+" рублей" );
    }
    public void PriceofCredit(){
        System.out.println("Ежемесячный платеж по кредиту на 10 лет : "+result/120+" рублей");
    }
}
