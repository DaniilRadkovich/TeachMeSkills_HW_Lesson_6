package com.teachmeskills.lesson_6.task_3.test;

import com.teachmeskills.lesson_6.task_3.contract.Employee;
import com.teachmeskills.lesson_6.task_3.contract.Finance;
import com.teachmeskills.lesson_6.task_3.contract.Products;
import com.teachmeskills.lesson_6.task_3.system.Register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Products products1 = new Products(12, new SimpleDateFormat("dd.MM.yyyy").parse("18.02.2010"), "Toys", 2);
        Employee employee1 = new Employee(7, new SimpleDateFormat("dd.MM.yyyy").parse("02.02.2015"), new SimpleDateFormat("dd.MM.yyyy").parse("02.02.2020"), "Vasya Pups");
        Finance finance1 = new Finance(9, new SimpleDateFormat("dd.MM.yyyy").parse("30.10.2021"), 1024, 45);

        Register register = new Register();

        register.docSave(products1);
        register.docSave(employee1);
        register.docSave(finance1);

        System.out.println(register.getDocInfo(products1));
        System.out.println(register.getDocInfo(employee1));
        System.out.println(register.getDocInfo(finance1));
    }
}
