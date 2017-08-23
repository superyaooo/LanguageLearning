/*forEach and Map*/
Map<String, Integer> items = new HashMap<>();
items.put("A", 10);
items.put("B", 20);
items.put("C", 30);
items.put("D", 40);
items.put("E", 50);

items.forEach((k,v) -> System.out.println("Item: " + k + " Count: " + v));
items.forEach((k,v) -> {
    System.out.println("Item: " + k + "Count: " + v);
    if("E".equals(k)) {
        System.out.println("Hello E");
    }
});


/*forEach and List*/
items.forEach(item -> System.out.println(item));    // output: A,B,C,D,E
// output: C
items.forEach(item -> {
    if("C".equals(item)) {
        System.out.println(item);
    }
});
// method reference
items.forEach(System.out::println);     // output: A,B,C,D,E
// stream and filter
items.stream().filter(s -> s.contains("B")).forEach(System.out::println);   // output: B
