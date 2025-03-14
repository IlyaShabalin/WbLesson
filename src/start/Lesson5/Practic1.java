package start.Lesson5;

public class Practic1 {
    public static void main(String[] args) {
        int[] number ={3,2,10,5,8};
        //Распечатать четные числа
         for (int numbers : number){
             if (numbers %2 ==0){
                 System.out.println(numbers);
             }
         }
    }
}
