package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
    private List<Product> productList;
    private LocalDate invoiceDate;

    public Invoice(List<Product> productList, LocalDate invoiceDate) {
        this.productList = productList;
        this.invoiceDate = invoiceDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
