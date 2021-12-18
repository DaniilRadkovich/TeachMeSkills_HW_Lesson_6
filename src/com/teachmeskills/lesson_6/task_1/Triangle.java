package com.teachmeskills.lesson_6.task_1;

public class Triangle extends Figure {

    double a;
    double b;
    double c;

    @Override
    public double getPerimeter() {
        double result = a + b + c;
        return result;
    }

    @Override
    public double getArea() {
        double per = (a + b + c) / 2;
        double result = Math.sqrt(per * (per - a) * (per - b) * (per - c));
        return result;
    }

    @Override
    public String figureName() {
        return "Triangle";
    }

    public Triangle(double aSide, double bSide, double cSide) {
        this.a = aSide;
        this.b = bSide;
        this.c = cSide;
    }
}
