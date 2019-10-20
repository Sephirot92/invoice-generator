package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.time.LocalDate;
import java.util.ArrayList;

public class InvoiceForArray {
    private int invoiceNumber = 0;
    private ArrayList<Product> invoiceToArray;
    private Double totalAmountOnInvoice;
    private LocalDate dateOfInvoice = LocalDate.now();

    public InvoiceForArray(int invoiceNumber, ArrayList<Product> invoiceToArray, Double totalAmountOnInvoice, LocalDate dateOfInvoice) {

    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public ArrayList<Product> getInvoiceToArray() {
        return invoiceToArray;
    }

    public double getTotalAmountOnInvoice() {
        return totalAmountOnInvoice;
    }

    public LocalDate getDateOfInvoice() {
        return dateOfInvoice;
    }

    @Override
    public String toString() {
        return "InvoiceForArray{" +
                "invoiceNumber=" + invoiceNumber +
                ", Products of Invoice, Amount & Prices =" + invoiceToArray +
                ", Total Price =" + totalAmountOnInvoice +
                ", Date of Invoice=" + dateOfInvoice +
                '}' + "\n";
    }

    public InvoiceForArray invoiceForArrayCreator() {
        Invoice invoice = new Invoice();

        invoiceNumber = invoiceNumber + 1;
        invoiceToArray = invoice.createListOfProductsForInvoice();
        totalAmountOnInvoice = invoiceToArray.stream()
                .map(x -> x.getTotalPriceForProduct())
                .reduce(0.0, Double::sum);

        return new InvoiceForArray(invoiceNumber, invoiceToArray, totalAmountOnInvoice, dateOfInvoice);
    }


}
