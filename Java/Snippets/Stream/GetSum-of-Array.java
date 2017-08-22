// Java 8
int[] intArray = {10, 60, 70};
int total = Arrays.stream(intArray).sum();

// also works with double arrays
double[] doubleArray = {1, 22, 425};
double total = Arrays.stream(doubleArray).sum();
// or
double total = DoubleStream.of(doubleArray).sum();
