package oop.inheritans.lesson9.task1;

public class Task {
    //Мы создаем профессии на предприятии
    //Для охранника характерно умение -сторожить/Зарплата 15_000
    //Для бухгалтера характерно -считать налоги.Бухгалтер офисный работник.Зарплата 50_000
    //Для секретаря характерно печатать документы .Секретарь офисный работник. Зарплата 30_000
    //Каждый офисный работник умеет пить кофе.
    //Каждый человек умеет получать зарплату (характерную для его профессии).
    //У каждого человека есть пол.
    //Воссоздать такую структуру в java

    public static void main(String[] args) {
      Securyty securyty = new Securyty(true);
        Finansist finansist = new Finansist(false);
        secretary secretary = new secretary(false);

        secretary.getSalary();
        finansist.getSalary();
        secretary.getSalary();
        secretary.drinkCoffee();

    }
}
