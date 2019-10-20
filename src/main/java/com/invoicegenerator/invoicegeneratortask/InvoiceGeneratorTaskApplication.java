package com.invoicegenerator.invoicegeneratortask;

import com.invoicegenerator.invoicegeneratortask.invoiceCreator.InvoiceFabricator;

public class InvoiceGeneratorTaskApplication {

    public static void main(String[] args) {
        InvoiceFabricator invoiceFabricator = new InvoiceFabricator();
        System.out.println(invoiceFabricator.fabricateInvoices());
    }
}
