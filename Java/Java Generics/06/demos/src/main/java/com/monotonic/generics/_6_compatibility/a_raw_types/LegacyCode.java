package com.monotonic.generics._6_compatibility.a_raw_types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode
{
    public static void main(String[] args)
    {
        List values = new ArrayList();      // raw types
        values.add("abc");
        values.add(1);
        values.add(new Object());

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        legacyMethod(integers);


        Iterator iterator = values.iterator();
        while (iterator.hasNext())
        {
            Object element = iterator.next();
            System.out.println(element);
        }
    }

    public static void legacyMethod(List list) {

    }
}
