package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return Math.PI*radius*2;
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + radius + "which is a subclass of " + super.toString();
    }
}