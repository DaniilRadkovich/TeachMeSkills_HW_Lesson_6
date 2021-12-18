package com.teachmeskills.lesson_6.task_2;

public class Booker implements Info{
    public String position = "I'm booker!";

    @Override
    public void getPosition() {
        System.out.println(position);
    }
}
