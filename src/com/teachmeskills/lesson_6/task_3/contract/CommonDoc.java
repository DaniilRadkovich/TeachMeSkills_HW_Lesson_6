package com.teachmeskills.lesson_6.task_3.contract;

import java.util.Date;

public abstract class CommonDoc {

    int docNumber;
    Date docDate;

    public CommonDoc (int docNumber, Date docDate){
        this.docNumber = docNumber;
        this.docDate = docDate;
    }
    public CommonDoc (){

    }


}
