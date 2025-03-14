package oop.class_object.equals_and_hascode;

public class Example {
    public static void main(String[] args) {

        Child child1 = new Child("ilya", 24);
        Child child2 = new Child("Vova", 25);
        Child child3 = new Child("Vladimir", 22);
        Child child4 = new Child("Valentin", 221);

        Child[] children = {child1, child2, child3, child4};
        ChilrenGarden chilrenGarden = new ChilrenGarden(children);

        boolean result = false;
        Child childForFind = new Child("Vladimir", 22);

        for (Child child : chilrenGarden.getChildren()) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}
