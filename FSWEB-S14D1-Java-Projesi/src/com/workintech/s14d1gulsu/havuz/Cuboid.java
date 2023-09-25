package com.workintech.s14d1gulsu.havuz;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
