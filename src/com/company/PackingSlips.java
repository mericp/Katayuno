package com.company;

import java.util.HashMap;
import java.util.Map;

public class PackingSlips {
    public static Map<String, String> packingSlip = new HashMap<>();

    public PackingSlips()
    {
        packingSlip.put("Rule1", "generate packing slip for shipping");
        packingSlip.put("Rule2", "create duplicate packing slip for the royalty department");
    }
}
