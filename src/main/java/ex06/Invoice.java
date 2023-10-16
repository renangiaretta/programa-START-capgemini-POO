package ex06;

import java.util.Random;

public class Invoice {
    private int itemNumber;
    private String itemDescription;
    private int itemQuantity;
    private double itemUnitPrice;

    public Invoice (int itemNumber, String itemDescription, int itemQuantity, double itemUnitPrice) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.itemQuantity = Math.max(itemQuantity, 0);
        if (itemUnitPrice < 0) {
            this.itemUnitPrice = 0;
        } else {
            this.itemUnitPrice = itemUnitPrice;
        }
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemUnitPrice(double itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public double getInvoiceAmount() {
        return this.itemQuantity * this.itemUnitPrice;
    }
}
