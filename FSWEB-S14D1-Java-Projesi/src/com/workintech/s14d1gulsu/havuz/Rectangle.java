package com.workintech.s14d1gulsu.havuz;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length){
        if (width<0) {
            this.width=0;
        } else {
            this.width=width;
        };
        if (length<0) {
            this.length=0;
        } else {
            this.length=length;
        }
    }

    public int getWidth(){
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return getLength()*getWidth();
    }
}
