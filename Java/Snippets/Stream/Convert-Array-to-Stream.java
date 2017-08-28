/*use Arrays.stream or Stream.of to convert an Array into Stream*/

/**Object Arrays**/
String[] strArray = {"a", "b", "c"};
// Arrays.stream
Stream<String> stream1 = Arrays.stream(strArray);
stream1.forEach(x -> System.out.println(x));
// Stream.of
Stream<String> stream2 = Stream.of(strArray);
stream2.forEach(x -> System.out.println(x));

/**Primitive Arrays**/
int[] intArray = {1, 2, 3, 4, 5};
// Arrays.stream -> IntStream
IntStream intStream1 = Arrays.stream(intArray);
intStream1.forEach(x -> System.out.println(x));
// Stream.of -> Stream<int[]>
Stream<int[]> temp = Stream.of(intArray);
IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));   // convert/flat Stream<int[]> to IntStream to print
intStream2.forEach(x -> System.out.println(x));
