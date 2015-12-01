package com.company;

public class Product {
    private boolean physical;
    private boolean book;

    public Product()
    {
        this.physical = false;
        this.book = false;
    }

    public void setPhysical(boolean physical)
    {
        this.physical = physical;
    }

    public boolean getPhysical()
    {
        return physical;
    }

    public void setBook(boolean book)
    {
        this.book = book;
    }

    public boolean getBook()
    {
        return book;
    }

    public String payment()
    {
        if (this.book) {
            return PackingSlips.packingSlip.get("Rule1");
        }
        else if (this.physical) {
            return PackingSlips.packingSlip.get("Rule2");
        }
        else {
            return "Fatal Error!!";
        }
    }
}
