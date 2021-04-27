package com.box;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes ={new Box1(),new Box2(),new Box3()};

        int length = 4;
        int width = 5;
        int height = 5;
        for (Box box: boxes){
            if(box.validate(length,width,height)){
                System.out.println(box.name +"it is!,"+ box.price);
                break;
            }
        }
//        Box1 box1 = new Box1();
//        Box2 box2 = new Box2();
//        int[] numbers = {1, 5, 3, 2, 1};
//        Box[] boxes = {new Box1(),new Box2()};
//        System.out.println(box1.validate(15, 5, 5));
//        System.out.println(box2.validate(15, 5, 5));
//        int length = 15;
//        int width = 5;
//        int height = 5;
//        if(box1.validate(length,width,height)) {
//            System.out.println("Box1 it is!");
//        }else if(box2.validate(length,width,height)){
//            System.out.println("Box2 it is!");
//        }
    }
}
