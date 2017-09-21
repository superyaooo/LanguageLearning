package com.monotonic.collections._3_lists;

import com.monotonic.collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>
{
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product> products = new ArrayList<>();
    private List<Product> heavyVanProducts = new ArrayList<>();
    private List<Product> lightVanProducts = new ArrayList<>();

    public static final int PRODUCT_NOT_PRESENT = -1;

    public void add(Product product)
    {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct)
    {
        int index = products.indexOf(oldProduct);
        if(index != PRODUCT_NOT_PRESENT) {
            products.set(index, newProduct);
        }
    }

    public void prepare()
    {
        // sort products by weight
        products.sort(Product.BY_WEIGHT);

       /*
       // find product index that needs heavy van
        int splitPoint = findSplitPoint();

        // assign views of product list for heavy and light vans
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());
        */

        for(Product product : products) {
            if(product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                heavyVanProducts.add(product);
            }
            else {
                lightVanProducts.add(product);
            }
        }
    }

   /* private int findSplitPoint()
    {
        for(int i=0; i<products.size(); i++) {
            if(products.get(i).getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }

        return 0;
    }*/

    public List<Product> getHeavyVanProducts()
    {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts()
    {
        return lightVanProducts;
    }

    public Iterator<Product> iterator()
    {
        return products.iterator();
    }
}
