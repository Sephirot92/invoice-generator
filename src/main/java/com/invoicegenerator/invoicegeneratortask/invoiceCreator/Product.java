package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

public class Product {
    private String productName;
    private String productCategory;
    private int quanity;
    private double priceForOneProduct;
    private double totalPriceForProduct;

    public Product(String productName, String productCategory, int quanity, double priceForOneProduct) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.quanity = quanity;
        this.priceForOneProduct = priceForOneProduct;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getQuanity() {
        return quanity;
    }

    public double getPriceForOneProduct() {
        return priceForOneProduct;
    }

    public double getTotalPriceForProduct() {
        return totalPriceForProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quanity=" + quanity +
                ", priceForOneProduct=" + priceForOneProduct +
                ", totalPriceForProduct=" + totalPriceForProduct +
                '}';
    }
}
