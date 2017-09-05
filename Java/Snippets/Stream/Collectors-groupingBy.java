/*
Group by a List and display total count
*/
List<String> items = Arrays.asList("banana", "banana", "pear", "banana", "bloodorange");
// printout: {banana=3, pear=1, bloodorange=1}
Map<String, Long> result = items.stream().collect(
                                Collectors.groupingBy(Function.identity(), Collectors.counting())
                            );
// sort map to print out {pear=1, bloodorange=1, banana=3}
Map<String, Long> sorted = result.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue())
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));


/*
Group by a list of user defined Objects
*/
List<Item> items = Arrays.asList(
        new Item("pear", 10, new BigDecimal("5.99")),
        new Item("banana", 20, new BigDecimal("1.99")),
        new Item("bloodorange", 10, new BigDecimal("7.99")),
        new Item("pear", 10, new BigDecimal("5.99")),
        new Item("banana", 10, new BigDecimal("1.99"))
);
Map<String, Long> counting = items.stream().collect(
                                Collectors.groupingBy(Item::getName, Collectors.counting())
                            );      // printout: {banana=2, pear=2, bloodorange=1}
Map<String, Integer> sum = items.stream().collect(
                                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));


/*
.groupingBy and .mapping
*/
Map<BigDecimal, Set<String>> result = items.stream.collect(
                                    Collectors.groupingBy(Item::getPrice,       // group by price
                                        Collectors.mapping(Item::getName, Collectors.toSet())   // .mapping to convert List<Item> to Set<String>
                                    )
                                );      // printout: { 5.99=[pear], 1.99=[banana], 7.99=[bloodorange] }
