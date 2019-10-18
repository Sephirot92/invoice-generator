package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

public class Product {
    private String productName;
    private String productCategory;
    private int quantity;
    private double priceForOneProduct;
    private double totalPriceForProduct;

    public Product(String productName, String productCategory, int quanity, double priceForOneProduct) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.quantity = quanity;
        this.priceForOneProduct = priceForOneProduct;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPriceForOneProduct() {
        return priceForOneProduct;
    }

    public double getTotalPriceForProduct() {
        return totalPriceForProduct;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPriceForOneProduct(double priceForOneProduct) {
        this.priceForOneProduct = priceForOneProduct;
    }

    public void setTotalPriceForProduct(double totalPriceForProduct) {
        this.totalPriceForProduct = totalPriceForProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quanity=" + quantity +
                ", priceForOneProduct=" + priceForOneProduct +
                ", totalPriceForProduct=" + totalPriceForProduct +
                '}';
    }
}
