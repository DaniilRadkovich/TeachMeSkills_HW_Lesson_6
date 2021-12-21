package com.teachmeskills.lesson_6.task_3.contract;

import java.util.Date;

public class Employee extends CommonDoc implements Document {

    Date endOfContract;
    String employeeName;

    public Employee(int docNumber, Date docDate, Date endOfContract, String employeeName) {
        super(docNumber, docDate);
        this.endOfContract = endOfContract;
        this.employeeName = employeeName;
    }

    public Employee() {
    }

    public String toString() {
        return "Products contract: " +
                "Document number: " + docNumber +
                ", Document date: " + docDate +
                ", Contract ends: " + endOfContract +
                ", Employee name: " + employeeName;
    }


}
