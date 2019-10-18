package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    boolean isThereAnotherProduct = true;
    char isThereMoreProduct;

    public Invoice() {
    }

    public ArrayList<Product> createListOfProductsForInvoice() {
        ArrayList<Product> listOfProductForInvoice = new ArrayList<>();

        while (isThereAnotherProduct) {
            System.out.println("Type product, which will be placed in Invoice:");
            Product productCreation = new ProductInvoiceGenerator().createProduct();
            listOfProductForInvoice.add(productCreation);
            System.out.println("Do you want to add another product? Type 1 if there is another product. If no, type 0.");
            Scanner scanner = new Scanner(System.in);
            isThereMoreProduct = (char) scanner.nextByte();
            if (isThereMoreProduct == 1) {
            } else if (isThereMoreProduct == 0) {
                isThereAnotherProduct = false;
            } else {
                System.out.println("Warning, detected wrong character. You have to retype.");
            }
        }
        return listOfProductForInvoice;
    }

}
