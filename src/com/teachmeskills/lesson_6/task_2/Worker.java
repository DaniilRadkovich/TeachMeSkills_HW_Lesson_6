package com.teachmeskills.lesson_6.task_2;

public class Worker implements Info{
    public String position = "I'm worker!";

    @Override
    public void getPosition() {
        System.out.println(position);
    }
}
