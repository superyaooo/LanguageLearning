package com.monotonic.collections._4_sets;

import com.monotonic.collections.Product;
import com.monotonic.collections.Supplier;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//import static com.monotonic.collections.Product.BY_NAME;
import static com.monotonic.collections.Product.BY_WEIGHT;

public class ProductCatalogue implements Iterable<Product>
{
    // Set contains only unique elements (no duplicate data)
//    private final Set<Product> products = new HashSet<>();
//    private final Set<Product> products = new TreeSet<>(BY_NAME);
    private final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier)
    {
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator()
    {
        return products.iterator();
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProduct);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        for(Product product : products) {
            if(product.getWeight() > 20) {
                return product;
            }
        }

        return products.last();
    }
}
