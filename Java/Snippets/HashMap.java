/**
 * Maps are like dictionaries
 *
 * HashMap class - efficient general purpose Map implementation
 *
*/

Map<String, String> map = new HashMap<>();

map.put("2222", "ghi");
map.put("3333", "abc");
map.put("1111", "def");

String s1 = map.get("3333");	// output: abc
String s2 = map.get("9999");	// output: null
String s3 = map.getOrDefault("9999", "xyz");	// output: xyz

map.forEach((k, v) -> System.out.println(k + " | " + v));
/**
 * output:
 * 2222 | ghi
 * 3333 | abc
 * 1111 | def
*/

map.replaceAll((k, v) -> v.toUpperCase());
map.forEach((k, v) -> System.out.println(k + " | " + v));
/**
 * output:
 * 2222 | GHI
 * 3333 | ABC
 * 1111 | DEF
*/