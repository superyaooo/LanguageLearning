/**
 * Maps are like dictionaries
 *
 * TreeMap class - SortedMap implemented as a self-balancing tree
 *				   Suports Comparable and Comparator sorting
 *
*/

SortedMap<String, String> map = new TreeMap<>();

map.put("2222", "ghi");
map.put("3333", "abc");
map.put("1111", "def");
map.put("6666", "xyz");
map.put("4444", "mno");
map.put("5555", "pqr");

map.forEach((k, v) -> System.out.println(k + " | " + v));
/**
 * output:
 * 1111 | def
 * 2222 | ghi
 * 3333 | abc
 * 4444 | mno
 * 5555 | pqr
 * 6666 | xyz
*/

// headMap - return a map for all keys that are less than the specified key
SortedMap<String, String> hMap = map.headMap("3333");
hMap.forEach((k, v) -> System.out.println(k + " | " + v));
/**
 * output:
 * 1111 | def
 * 2222 | ghi
*/

// tailMap - return a map for all keys that are greater than or equal to the specified key
SortedMap<String, String> tMap = map.tailMap("3333");
tMap.forEach((k, v) -> System.out.println(k + " | " + v));
/**
 * output:
 * 3333 | abc
 * 4444 | mno
 * 5555 | pqr
 * 6666 | xyz
*/


/** subMap - return a map for all keys that are greater than or equal to the starting key 
 *			  and less than the ending key
*/          
