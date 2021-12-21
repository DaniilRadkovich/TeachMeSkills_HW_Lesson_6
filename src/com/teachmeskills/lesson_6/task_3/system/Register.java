package com.teachmeskills.lesson_6.task_3.system;

import com.teachmeskills.lesson_6.task_3.contract.Document;

public class Register {

    Document[] arrayDoc = new Document[10];

    public Register() {
    }

    public Register(Document[] arrayDoc) {
        this.arrayDoc = arrayDoc;
    }

    public void docSave(Document document) {
        for (int i = 0; i < arrayDoc.length; i++) {
            if (arrayDoc[i] == null) {
                arrayDoc[i] = document;
                break;
            }
        }
    }

    public String getDocInfo(Document document) {
        for (int i = 0; i < arrayDoc.length; i++) {
            if (arrayDoc[i] == document) {
                return arrayDoc[i].toString();
            }
        }
        return "No document find!";
    }

}
