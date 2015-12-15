package com.company.test;

import com.company.Book;
import com.company.PackingSlip;
import com.company.PackingSlips;
import com.company.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class test1Test {
    @Test
    public void testIfPhysicalProductGeneratePackingSlip() {
        Product product = new Product(true);

        List<PackingSlip> result = product.payment();
        String firstSlipOwner = result.get(0).getOwner();

        Assert.assertTrue(result.size() == 1);
        Assert.assertEquals(firstSlipOwner, "shipping");
    }

    @Test
    public void testIfBookDuplicatePackingSlip() {
        Product product = new Book();

        List<PackingSlip> result = product.payment();
        String duplicatedSlipOwner = result.get(1).getOwner();

        Assert.assertTrue(result.size() == 2);
        Assert.assertEquals(duplicatedSlipOwner, "royalty");
    }
}