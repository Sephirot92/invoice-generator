package com.invoicegenerator.invoicegeneratortask;

import com.invoicegenerator.invoicegeneratortask.invoiceCreator.Product;
import com.invoicegenerator.invoicegeneratortask.invoiceCreator.ProductInvoiceGenerator;

public class InvoiceGeneratorTaskApplication {

    public static void main(String[] args) {
        Product productCreation = new ProductInvoiceGenerator().createProduct();

    }

}
