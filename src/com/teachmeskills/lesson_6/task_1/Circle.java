package com.teachmeskills.lesson_6.task_1;

public class Circle extends Figure {
    double radius;

    @Override
    public double getPerimeter() {
        double result = Math.PI * 2 * radius;
        return result;
    }

    @Override
    public double getArea() {
        double result = Math.PI * radius * radius;
        return result;
    }

    @Override
    public String figureName() {
        return "Circle ";
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
