package com.company;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private boolean physical;
    private boolean book;

    public Product(boolean physical)
    {
        this.physical = physical;
        this.book = false;
    }

    public List<PackingSlip> payment()
    {
        List<PackingSlip> slips = new ArrayList<>();

        if (this.book) {
            //return PackingSlips.packingSlip.get("Rule1");
        }
        else if (this.physical) {
            PackingSlip slip = new PackingSlip("shipping");
            slips.add(slip);
        }

        return slips;
    }
}
