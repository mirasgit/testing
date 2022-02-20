package com.company;

public class Main {
    public static void main(String[] args){
        //Shape
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape.setColor("violet");
        shape.setFilled(true);
        System.out.println(shape.toString());
        //Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0, "red", false);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println("The area of a circle is " + circle2.getArea());
        System.out.println("The perimeter of a circle is " + circle2.getPerimeter());
        //Rectangle
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println(rectangle.toString());
        System.out.println("The area of a rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle.getPerimeter());
        //Square
        Square square = new Square(6.0);
        System.out.println(square.toString());
        System.out.println("The area of a square is " + square.getArea());
        System.out.println("The perimeter of a square is " + square.getPerimeter());
    }
    }



