package com.company;

class Rectangle {
    // fields definition
    private int length;
    private int width;
    private int perimeter;
    private int square;
    private int diagonal;



    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public static int getArea(int width, int length) {
        return width * length;
    }

    public int getSquare() {
        return width * length ;

    }

    public int getPerimetr() {
        return width + length + width + length ;

    }

    public double getDiagonal() {
        return Math.sqrt(length^2 + width^2);
    }

    @Override
    public String toString() {
        return "Rectangle" + "\n" +
                "length = " + length + "\n" +
                "width = " + width + "\n" +
                "perimeter = " + getPerimetr() + "\n" +
                "diagonal = " + getDiagonal() + "\n" +
                "square = " + getSquare() + "\n"
                ;

    }
}
