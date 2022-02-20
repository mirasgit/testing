package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "Green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean b) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        String yesOrNot = (isFilled()) ? "is " : "is not ";
        return "A Shape with color of " + color + " and " + yesOrNot + "filled.  ";
    }
}
