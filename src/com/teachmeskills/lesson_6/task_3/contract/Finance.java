package com.teachmeskills.lesson_6.task_3.contract;

import java.util.Date;

public class Finance extends CommonDoc implements Document {

    double monthSum;
    int departmentCode;

    public Finance(int docNumber, Date docDate, double monthSum, int departmentCode) {
        super(docNumber, docDate);
        this.monthSum = monthSum;
        this.departmentCode = departmentCode;
    }

    public Finance() {
    }

    public String toString() {
        return "Products contract: " +
                "Document number: " + docNumber +
                ", Document date: " + docDate +
                ", Month sum: " + monthSum +
                ", Department code: " + departmentCode;
    }


}
