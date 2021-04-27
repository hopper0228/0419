package com.tom.test;

public class test {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(), new Box2(),new Box3(),new Box4(),new Box5()};
        int length = 20;
        int width = 10;
        int height = 10;
        for (Box box : boxes) {
            if(box.vaildate(length,width,height))
            {
                System.out.println(box.name + " is " + box.price);
            }
        }

    }
}
