package com.box.collection;

import com.box.Box1;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        String s = new String("name");
        list.add(s);
        Integer n = new Integer(123);
        list.add(n);
        list.add(true);
        Box1 box1 = new Box1();
        list.add(box1);
    }
}
