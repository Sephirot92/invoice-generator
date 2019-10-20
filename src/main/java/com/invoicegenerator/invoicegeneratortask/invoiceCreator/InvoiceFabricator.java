package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceFabricator {
    boolean isThereMoreInvoicesToAdd;
    int iteration = 0;
    char isThereAnotherInvoice;
    ArrayList<InvoiceForArray> invoicesArrayList = new ArrayList<>();
    Invoice invoice = new Invoice();
    ArrayList<Product> productsList = invoice.createListOfProductsForInvoice();
    InvoiceForArray invoiceForArray;

    public InvoiceFabricator() {
    }

    @Override
    public String toString() {
        return "InvoiceFabricator{" +
                "isThereMoreInvoicesToAdd=" + isThereMoreInvoicesToAdd +
                ", iteration=" + iteration +
                '}';
    }

    public ArrayList<InvoiceForArray> fabricateInvoices() {
        while (isThereMoreInvoicesToAdd) {

            Double price = productsList.stream()
                    .map(x -> x.getTotalPriceForProduct())
                    .reduce(0.0, Double::sum);

            invoiceForArray = new InvoiceForArray(iteration + 1, productsList, price, LocalDate.now());
            invoicesArrayList.add(invoiceForArray.invoiceForArrayCreator());
            iteration++;
            System.out.println("New Invoice added. Do you want to add another invoice? Type 1 if there is another Invoice, type 2 if there is not.");

            Scanner scanner = new Scanner(System.in);
            isThereAnotherInvoice = (char) scanner.nextByte();

            if (isThereAnotherInvoice == 1) {
                isThereMoreInvoicesToAdd = true;
            } else if (isThereAnotherInvoice == 0) {
                isThereMoreInvoicesToAdd = false;
            } else {
                System.out.println("Warning, detected wrong character. You have to retype.");
            }

        }
        return invoicesArrayList;
    }

}
