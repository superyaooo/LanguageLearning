package com.monotonic.collections;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements
{
    public static void main(String[] args)
    {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

//        Product result = idToProduct.getOrDefault(10, defaultProduct);
//        System.out.println(result);
//        System.out.println(idToProduct.get(10));
//        System.out.println();

//        Product result = idToProduct.replace(1, new Product(1, "Big Door", 50));
//        System.out.println(result);
//        System.out.println(idToProduct.get(4));

//        idToProduct.replaceAll((id, oldProduct) ->
//                new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);

//        Product result = idToProduct.computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 10));
//        System.out.println(result);
//        System.out.println(idToProduct.get(10));

        idToProduct.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
