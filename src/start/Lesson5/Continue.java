package start.Lesson5;

public class Continue {
    //Тренер дал задание спорстмену/Если при броске кубика выпадает 6 ,то он отдыхает ,иначе отжимание
    public static void main(String[] args) {
        int[] results = {3,5,6,2,1};
        for (int result : results){
            System.out.println(result);
            if (result ==6){
                System.out.println("Отжимания");
                continue;
            }
            System.out.println("Спорстмен отжимаештся ");
        }
    }
}
