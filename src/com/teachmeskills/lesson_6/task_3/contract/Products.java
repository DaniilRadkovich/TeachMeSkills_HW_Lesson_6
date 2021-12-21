package com.teachmeskills.lesson_6.task_3.contract;

import java.util.Date;

public class Products extends CommonDoc implements Document {

    String productType;
    int productsAmount;

    public Products(int docNumber, Date docDate, String productType, int productsAmount) {
        super(docNumber, docDate);
        this.productType = productType;
        this.productsAmount = productsAmount;
    }

    public Products() {
    }

    public String toString() {
        return "Products contract: " +
                "Document number: " + docNumber +
                ", Document date: " + docDate +
                ", Type of product: " + productType +
                ", Amount of products: " + productsAmount;
    }


}
