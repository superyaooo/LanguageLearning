/* filter() and collect() */
List<String> fruits = Arrays.asList("cherry", "watermelon", "apples");

List<String> goodFruits = fruits.stream()       // convert list to stream
        .filter(fruit -> !"apples".equals(fruit))   // filter out "apples"
        .collect(Collectors.toList());     // collect output and convert stream to list


/*filter(), findAny() and orElse()*/
List<Person> people = Arrays.asList(
        new Person("jack", 30),
        new Person("rose", 17),
        new Person("tom", 42)
);

Person jack = people.stream()       // convert list to stream
        .filter(x -> "jack".equals(x.getName()))        // only get "jack"
        .findAny()      // if found, return found value
        .orElse(null);      // if not found, return null

/*multiple condition*/
Person jack = people.stream()
        .filter((x) -> "jack".equals(p.getName()) && 30 == p.getAge())
        .findAny()
        .orElse(null);


/*filter() and map()*/
String name = people.stream()
        .filter(x -> "jack".equals(x.getName()))
        .map(Person::getName)       // convert stream to String
        .findAny()
        .orElse("");     // prints out jack's name as String

List<String> names = people.stream()
        .map(Person::getName)
        .collect(Collectors.toList());      // prints out everybody's name
