package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.util.Scanner;

public class ProductInvoiceGenerator {
    private Product product;

    public ProductInvoiceGenerator() {
    }

    public Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        String productNameToType;
        String productTypeToType;
        int amountOfProduct = 0;
        double priceForOneProduct = 0;
        double totalPrice = 0;

        System.out.println("Type product name:");
        productNameToType = scanner.nextLine();

        System.out.println("Now, type product type for Invoice:");
        productTypeToType = scanner.nextLine();

        System.out.println("Then, type product ammount:");
        amountOfProduct = scanner.nextInt();
        if (amountOfProduct < 0) {
            amountOfProduct = 0;
        }
        System.out.println("Finally, type price for one product:");
        priceForOneProduct = scanner.nextDouble();

        if (priceForOneProduct < 0) {
            priceForOneProduct = 0;
        }

        totalPrice = amountOfProduct * priceForOneProduct;

        if (totalPrice < 0.0) {
            totalPrice = 0.0;
        }


        System.out.println("So, the product is " + productNameToType + ", of type " + productTypeToType + ", it's ammount is " + amountOfProduct + " , and it's price for one is: " + priceForOneProduct + ". Total price is " + totalPrice);

        return new Product(productNameToType, productTypeToType, amountOfProduct, priceForOneProduct, totalPrice);

    }

}
