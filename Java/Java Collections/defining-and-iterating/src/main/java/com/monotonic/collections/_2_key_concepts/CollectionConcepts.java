package com.monotonic.collections._2_key_concepts;

import com.monotonic.collections.Product;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        Collection<Product> removeProducts = new ArrayList<>();
        // when looping through a collection, do not modify the collection inside the loop to avoid ConcurrentModificationException
        for (Product product : products) {
            System.out.println(product);
            if(product.getWeight() < 20) {
                removeProducts.add(product);
            }
        }

        products.removeAll(removeProducts);     // use .removeAll() to remove a small collection off a bigger collection
        System.out.println(products);
        System.out.println(products.contains(window));
    }
}
