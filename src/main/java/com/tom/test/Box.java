package com.tom.test;

public class Box {
    String name;
    int length;
    int width;
    int height;
    int price;
    public boolean vaildate(int a , int b , int c)
    {
        if(length >= a && width >= b && height >= c)
        {
            return true;
        }
        else return false;
    }
}
