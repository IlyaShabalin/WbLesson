package recurscion;

public class Recursion {
    public int sum(int number){
        if( number < 1){
            return 0;
        }
        int reuslt = number + sum(number - 1);
        return  reuslt;
    }

    //number = 10 -> result =10 + sum(9)
    // number = 9-> result = 9 + sum (8)
    //...
    // number = 2 -> result = 2 + 1
    //number = 1 -> result = 1 + 0
    //number = 0 -> result 0
}
