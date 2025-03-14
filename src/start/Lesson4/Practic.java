package start.Lesson4;

public class Practic {
    public static void main(String[] args) {
        boolean Engine = true;
        boolean Transmisssion = true;
        boolean Wheel1 = true;
        boolean Wheel2 = true;
        boolean Wheel3 = true;
        boolean Wheel4 = true;
        int goodWheel = 0;
        goodWheel += Wheel1 ? 1:0;
        goodWheel += Wheel2 ? 1:0;
        goodWheel += Wheel3 ? 1:0;
        goodWheel += Wheel4 ? 1:0;

        if(Engine && Transmisssion && (goodWheel >=3 )){
            System.out.println("Заебись , все работает");
        }
    }
}
