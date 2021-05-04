package com.box.collection;

import com.box.Box;
import com.box.Box1;
import com.box.Box2;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        //String s = new String("cindy");
        list.add("cindy");
        Integer n = new Integer(123);
        list.add(n);
        list.add(true);
        Box1 box = new Box1();
        list.add(box);
        //
        String name = (String) list.get(0);
        String abc = (String) list.get(1);
        //
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
    }
}
