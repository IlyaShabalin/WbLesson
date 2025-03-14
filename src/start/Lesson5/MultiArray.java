package start.Lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] multiArray = {group1, group2};

        metkaFor:
        for (int[] array : multiArray) {
            for (int number : array){
                if (number==178){
                    System.out.println("Вор найден ");
                    break metkaFor;
                }else{
                    System.out.println("Вор не найден");
                }
            }
        }
    }
}
