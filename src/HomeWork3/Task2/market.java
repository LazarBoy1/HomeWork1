package HomeWork3.Task2;

import java.util.ArrayList;

public class market  {

    public static void main(String[] args) {
        OrangeExtendsFruit[] oranges = new OrangeExtendsFruit[10];
        ArrayList<OrangeExtendsFruit> orangesList = new ArrayList<>(10);

        OrangeExtendsFruit orange0 = new OrangeExtendsFruit(1);
        OrangeExtendsFruit orange1 = new OrangeExtendsFruit(1);
        OrangeExtendsFruit orange2 = new OrangeExtendsFruit(1);
        OrangeExtendsFruit orange3 = new OrangeExtendsFruit(1);
        oranges[0] = orange0;
        orangesList.add(orange0);
        oranges[1] = orange1;
        orangesList.add(orange1);
        oranges[2] = orange2;
        orangesList.add(orange2);
        oranges[3] = orange3;
        orangesList.add(orange3);
        Box<OrangeExtendsFruit> box1 = new Box<>(oranges,orangesList);

        OrangeExtendsFruit[] oranges2 = new OrangeExtendsFruit[10];
        ArrayList<OrangeExtendsFruit> orangesList2 = new ArrayList<>();
        oranges2[0] = orange0;
        orangesList2.add(orange0);
        oranges2[1] = orange1;
        orangesList2.add(orange1);
        oranges2[2] = orange2;
        orangesList2.add(orange2);
        oranges2[3] = orange3;
        orangesList2.add(orange3);
        OrangeExtendsFruit orange4 = new OrangeExtendsFruit(1);
        oranges2[4] = orange4;
        Box<OrangeExtendsFruit> box2 = new Box<> (oranges2,orangesList2);

        System.out.println(box1.getWeightArray());
        System.out.println(box2.getWeightList());

        System.out.println(box1.compare(box2));
        System.out.println(box1.compareList(box2));

        box1.toEmptyArray(box2);
        box1.toEmptyList(box2);

        System.out.println(box2);

        AppleExtendsFruit[] Apples = new AppleExtendsFruit[10];
        ArrayList<AppleExtendsFruit> AppleArrayList = new ArrayList<>(2);
        Box<AppleExtendsFruit> box3 = new Box<>(Apples,AppleArrayList);
        box1.compare(box3);

    }
}