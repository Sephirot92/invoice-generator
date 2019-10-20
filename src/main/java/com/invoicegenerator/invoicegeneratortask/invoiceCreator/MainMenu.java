package com.invoicegenerator.invoicegeneratortask.invoiceCreator;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    int numberOfOption;
    int numberToBeDeleted;
    InvoiceFabricator invoiceFabricator;

    public MainMenu() {
        System.out.println("Welcome in main menu of Invoice Fabricator");
        System.out.println("Type 1. to create invoices, type 2. to show all invoices, type 3. to enter delete invoice options.");
        numberOfOption = scanner.nextInt();
        if (numberOfOption > 0 && numberOfOption < 4) {

            switch (numberOfOption) {
                case 1:
                    invoiceFabricator.fabricateInvoices();
                case 2:
                    for (int i = 0; i < invoiceFabricator.fabricateInvoices().size(); i++) {
                        System.out.println(invoiceFabricator.fabricateInvoices().get(i));
                    }
                case 3:
                    for (int i = 0; i < invoiceFabricator.fabricateInvoices().size(); i++) {
                        System.out.println(invoiceFabricator.fabricateInvoices().get(i));
                    }
                    System.out.println("Type number of invoice which will be deleted");
                    numberToBeDeleted = scanner.nextInt();
                    if (numberToBeDeleted <= invoiceFabricator.fabricateInvoices().size() && numberToBeDeleted >= 1) {
                        numberToBeDeleted--;
                        invoiceFabricator.fabricateInvoices().remove(numberToBeDeleted);
                    } else {
                        System.out.println("Warning, detected wrong typed in number. Please retype it.");
                    }
            }
        } else {
            System.out.println("Warning, detected wrong typed in number. Please retype it.");
        }
    }
}