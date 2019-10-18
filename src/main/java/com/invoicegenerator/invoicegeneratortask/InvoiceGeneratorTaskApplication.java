package com.invoicegenerator.invoicegeneratortask;

import com.invoicegenerator.invoicegeneratortask.invoiceCreator.Invoice;

public class InvoiceGeneratorTaskApplication {

    public static void main(String[] args) {
        Invoice invoice = new Invoice();

        System.out.println(invoice.createListOfProductsForInvoice());

    }

}
