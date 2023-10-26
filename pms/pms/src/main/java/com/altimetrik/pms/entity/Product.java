package com.altimetrik.pms.entity;

public class Product {

    private int productId;

    private String productName;

    private int productCost;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductCost() {
        return productCost;
    }
}
