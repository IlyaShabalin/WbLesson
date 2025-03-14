package start.Lesson6;

public class FormatPractic {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000_00;
        boolean hasAutomaticTransmission = true;
        //Задача с помощью String format составить строку:
        //Привет, я менеджер салона [Имя бренда]
        //У нас есть модель- [Имя модели] за [цена]
        //Есть ли у нее автоматическая коробка передач?
        //[Да/Нет]

        String result = """
                Привет , я менеджер салона %s.
                У нас есть модель %s за %f 
                Есть ли у нее автоватическая коробка передач? 
                %s
                """.formatted(carMark,carModel,price,hasAutomaticTransmission ? "ДА": "НЕт");
        System.out.println(result);

    }
}
