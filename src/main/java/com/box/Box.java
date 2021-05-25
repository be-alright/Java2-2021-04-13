package com.box;

public class Box {
    int length;
    int width;
    int height;
    int price;
    String name;

    public boolean validate(int a, int b, int c) {
        if (length >= a && width >= b && height >= c) {
            return true;
        } else
            return false;
    //public abstract String getName

    }
}

