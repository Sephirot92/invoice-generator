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
        int ammountOfProduct = 0;
        double priceForOneProduct = 0;

        System.out.println("Welcome into product creator. First, type product name:");
        productNameToType = scanner.nextLine();

        System.out.println("Now, type product type for Invoice:");
        productTypeToType = scanner.nextLine();

        System.out.println("Then, type product ammount:");
        ammountOfProduct = scanner.nextInt();
        if (ammountOfProduct < 0) {
            ammountOfProduct = 0;
        }
        System.out.println("Finally, type price for one product:");
        priceForOneProduct = scanner.nextDouble();

        System.out.println("So, the product is " + productNameToType + ", of type " + productTypeToType + ", it's ammount is " + ammountOfProduct + " , and it's price for one is: " + priceForOneProduct + ".");

        return new Product(productNameToType, productTypeToType, ammountOfProduct, priceForOneProduct);

    }

}
