// forEach & lambda expression
ArrayList<MyClass> list = new ArrayList<>();

MyClass v1 = new MyClass("v1", "abc");  // label and value pair
MyClass v2 = new MyClass("v2", "xyz");
MyClass v3 = new MyClass("v3", "abc");

list.add(v1);
list.add(v2);
list.add(v3);

list.forEach(m -> System.out.println(m.getLabel()));	// result: v1 v2 v3

// removeIf & lambda expression
list.removeIf(m -> m.getValue().equals("abc"));		// remove v1 and v3 based on value


// List.sort() with lambda, int
list.sort((Person m, Person n) -> m.getAge() - n.getAge());
// parameter type is optional for lambda
list.sort((m, n) -> m.getAge() - n.getAge());

// List.sort() with lambda, String
list.sort((m, n) -> m.getName().compareTo(n.getName()));

// List.sort() with lambda, BigDecimal
list.sort((m, n) -> m.getSalary().compareTo(n.getSalary()));

// reversed sorting
Comparator<Person> salaryComparator = (m, n) -> m.getSalary().compareTo(n.getSalary());
list.sort(salaryComparator.reversed());