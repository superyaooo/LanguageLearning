/**
* Conversion - In general for most arrays
*
* * Note: if use 
* List<Element> list = Arrays.asList(array); 
* without passing it into a new ArrayList, the size of the list will be fixed instead of resizable.
*
*/

// Array to ArrayList
Element[] arr = {new Element(1), new Element(2), new Element(3)};
ArrayList<Element> arrList = new ArrayList<Element>(Arrays.asList(arr));

// ArrayList to Array
T[] newArr = arrList.toArray(new T[arrList.size()]);

// example with String array
String[] values = {"cat", "dog", "bird"};
ArrayList<String> aList = new ArrayList<String>(Arrays.asList(values));

// example using Collections.addAll
String[] values = {"cat", "dog", "bird"};
ArrayList<String> aList = new ArrayList<>();
Collections.addAll(aList, values);

// convert ArrayList to Array
String[] newArray = aList.toArray(new String[aList.size()]);



/*
* Special case - Convert int[] to ArrayList 
*
* Note: cannot use Collections.addAll
*
*/
int[] a = {1,3,15,3};      //int[] a = new int[3];
List<Integer> aList = new ArrayList<>();    // ArrayList<Integer> aList = new ArrayList<>();
for(int num:a){
	aList.add(num);
}

// convert int ArrayList to int[]
int[] newA = aList.stream().mapToInt(i->i).toArray();