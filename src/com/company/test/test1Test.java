package com.company.test;

import com.company.PackingSlips;
import com.company.Product;
import org.junit.Assert;
import org.junit.Test;

public class test1Test {
    @Test
    public void testIfPhysicalProductGeneratePackingSlip() {
        Product product = new Product();
        product.setPhysical(true);

        String result = product.payment();
        String expected = PackingSlips.packingSlip.get("Rule1");

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testIfBookDuplicatePackingSlip() {
        Product product = new Product();
        product.setBook(true);

        String result = product.payment();
        String expected = PackingSlips.packingSlip.get("Rule2");

        Assert.assertEquals(expected, result);
    }
}