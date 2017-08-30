/*
Steps to sort a Map:
    1. Convert Map to Stream
    2. Sort Stream
    3. Collect and return new LinkedHashMap

* Note: Collectors.toMap returns a HashMap by default
*/

// sort by keys
Map<String, Integer> unsortMap = new HashMap<>();
unsortMap.put("z", 10);
unsortMap.put("a", 6);
unsortMap.put("d", 1);
unsortMap.put("e", 7);
// need LinkedHashMap to keep the sorted order
Map<String, Integer> result = unsortMap.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey())
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

// sort by values
Map<String, Integer> result = unsortMap.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
