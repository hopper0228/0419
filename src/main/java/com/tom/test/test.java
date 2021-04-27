package com.tom.test;

public class test {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        boxes[0] = new Box1();
        boxes[1] = new Box2();
        boxes[2] = new Box3();
        boxes[3] = new Box4();
        boxes[4] = new Box5();
        System.out.println(boxes[3].price);
        //Box[] boxes = {new Box1(), new Box2(),new Box3(),new Box4(),new Box5()};
        int length = 20;
        int width = 5;
        int height = 5;
        for (Box box : boxes) {
//            Box1 box1 = (Box1) box;
            if(box.vaildate(length,width,height))
            {
                System.out.println(box.name + " is " + box.price);
                break;
            }
        }

    }
}
