package com.box.collection;

import com.box.Box;
import com.box.Box1;
import com.box.Box2;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        TreeSet <Integer> aa = new TreeSet<>();          //Integer可換成String
        System.out.println(aa.size());
        aa.add(2);
        aa.add(4);
        aa.add(3);
        aa.add(2);
        System.out.println(aa.size());
        System.out.println(aa);
        for (Integer a: aa) {

        }

        //分辨TreeSet和arrayList差別

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
