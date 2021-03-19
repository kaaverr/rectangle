package com.company;

public class Main {
    public static int getArea(int length, int width){
        return length * width;

    }

    public static void main(String[] args) {
        // linear programming
        int length = 2;
        int width = 3;
        int perimeter = length + width + length + width;
        int area = length * width;
        //System.out.println(area);
        // imperative programming
        area = getArea(2,3);
        // OOP
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r2.setLength(7);
        r2.setWidth(4);
        //System.out.println(r1.getLength());
        System.out.println(r2.toString());
        //System.out.println(r2.getPerimeter());
        int area2 = Rectangle.getArea(3 , 3);
        int p2 = r1.getPerimetr();
    }
}
