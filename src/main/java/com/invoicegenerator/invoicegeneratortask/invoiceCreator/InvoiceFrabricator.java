package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.util.ArrayList;

public class InvoiceFrabricator {
    private ArrayList<Product> invoice;
    protected Product product;

    public InvoiceFrabricator(Invoice invoice) {
        this.invoice = new ArrayList<Product>();
    }

}
