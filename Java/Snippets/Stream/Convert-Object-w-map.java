/*use stream().map() to convert an object to something else*/

// list of Strings -> Uppercase
List<String> strs = Arrays.asList("a", "b", "c");
List<String> strsUpper = strs.stream().map(String::toUpperCase).collect(Collectors.toList());

// list of integers -> multiply by 2
List<Integer> num = Arrays.asList(1, 2, 3);
List<Integer> numCollect = num.stream().map(n -> n*2).collect(Collectors.toList());

// list of Objects -> list of Strings
List<Person> persons = Arrays.asList(
                new Person("john", 50, new BigDecimal(10000)),
                new Person("daisy", 23, new BigDecimal(20000)),
                new Person("doug", 31, new BigDecimal(30000))
        );
List<String> names = persons.stream().map(x -> x.getName()).collect(Collectors.toList());

// list of Objects -> list of other Objects
List<SpecialPerson> spcPersons = persons.stream().map(temp -> {
    SpecialPerson obj = new SpecialPerson();
    obj.setName(temp.getName());
    obj.setAge(temp.getAge());
    if("john".equals(temp.getName())) {
        obj.setExtra("john is special!");
    }
    return obj;
}).collect(Collectors.toList());
