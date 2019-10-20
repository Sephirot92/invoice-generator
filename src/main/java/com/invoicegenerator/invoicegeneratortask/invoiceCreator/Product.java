package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

public class Product {
    private String productName;
    private String productCategory;
    private int quantity;
    private double priceForOneProduct;
    private double totalPriceForProduct;

    public Product(String productName, String productCategory, int quanity, double priceForOneProduct, double totalPriceForProduct) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.quantity = quanity;
        this.priceForOneProduct = priceForOneProduct;
        this.totalPriceForProduct = totalPriceForProduct;
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


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", quanity=" + quantity +
                ", priceForOneProduct=" + priceForOneProduct +
                ", totalPriceForProduct=" + totalPriceForProduct +
                '}' + "\n";
    }
}
