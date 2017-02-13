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

