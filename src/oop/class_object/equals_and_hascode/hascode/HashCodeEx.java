package oop.class_object.equals_and_hascode.hascode;

import oop.class_object.equals_and_hascode.Child;

public class HashCodeEx {
    public static void main(String[] args) {
        Child child1 = new Child("ilya", 2018);
        Child child2 = new Child("Vova", 2018);
        Child child3 = new Child("Vladimir", 2019);
        Child child4 = new Child("Valentin", 2019);

        Child[] group0 ={child1,child2};
        Child[] group1 ={child3,child4};
        Child[][] children = {group0,group1};

        Child childForFind = new Child("ilya", 2018);
        boolean result = false;

        ChildrenGardenWithGroup childrenGardenWithGroup = new ChildrenGardenWithGroup(children);
        for (Child child : childrenGardenWithGroup.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)) {

                result = true;
                break;
            }
        }


        System.out.println(result);
    }
}
