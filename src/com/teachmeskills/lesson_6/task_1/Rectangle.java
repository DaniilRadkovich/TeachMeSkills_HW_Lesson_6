package com.teachmeskills.lesson_6.task_1;

public class Rectangle extends Figure {
    double a;
    double b;

    @Override
    public double getPerimeter() {
        double result = 2 * a + 2 * b;
        return result;
    }

    @Override
    public double getArea() {
        double result = a * b;
        return result;
    }

    @Override
    public String figureName() {
        return "Rectangle";
    }

    public Rectangle(double aSide, double bSide) {
        this.a = aSide;
        this.b = bSide;
    }
}
