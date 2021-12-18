package com.teachmeskills.lesson_6.task_1;

public class Main {
    public static void main(String[] args) {
        double result = 0;

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(9);
        figures[1] = new Circle(16);
        figures[2] = new Rectangle(40, 3);
        figures[3] = new Rectangle(7, 5);
        figures[4] = new Triangle(8, 4, 6);

        for (Figure figure : figures) {
            System.out.println(figure.figureName() + " Area: " + figure.getArea() + " Perimeter: " + figure.getPerimeter());
        }

        for (Figure figure : figures) {
            result += figure.getPerimeter();
        }
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Final perimeter: " + result);
    }
}
