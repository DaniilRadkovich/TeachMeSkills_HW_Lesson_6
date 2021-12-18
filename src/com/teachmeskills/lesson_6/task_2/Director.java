package com.teachmeskills.lesson_6.task_2;

public class Director implements Info{
    public String position = "I'm director!";

    @Override
    public void getPosition() {
        System.out.println(position);
    }
}
