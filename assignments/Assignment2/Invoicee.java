package com.sunbeam;

class Invoice {
    private String Number;
    private String Description;
    private int quantity;
    private double pricePerItem;
    public Invoice(String Number, String Description, int quantity, double pricePerItem) {
        this.Number = Number;
        this.Description = Description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getNumber() {
        return Number;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class Invoicee{
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1234", "pen", 5, 9.99);
        Invoice invoice2 = new Invoice("5678", "rubber", 3, 1.0);
        System.out.println("Invoice 1: " + invoice1.getNumber() + " - " + invoice1.getDescription() + " - " + invoice1.getQuantity()+" - Amount: " + invoice1.getInvoiceAmount());
        System.out.println("Invoice 2: " + invoice2.getNumber() + " - " + invoice2.getDescription() +" - " + invoice2.getQuantity()+ " - Amount: " + invoice2.getInvoiceAmount());
    }
}