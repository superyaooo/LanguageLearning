/*convert stream to list using .collect() and Collectors.toList() */
Stream<String> language = Stream.of("java", "python", "ruby", null, "php", null);
List<String> strResult = language.collect(Collectors.toList());

Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
List<Integer> intResult = number.filter(x -> x != 3).collect(Collectors.toList());


/*filter out null values*/
Stream<String> language = Stream.of("java", "python", "ruby", null, "php", null);
List<String> result = language.filter(x -> x != null).collect(Collectors.toList());     // filter out null values
result.forEach(System.out::println);     // no null values in print out result
