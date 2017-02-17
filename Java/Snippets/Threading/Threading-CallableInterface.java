/**
 * Callable Interface:
 *  - Represents a task to be run on a thread
 *      > can return results
 *      > can throw exceptions
 *  - Only member is the call method
 *
 *  Future Interface:
 *   - Represents results of a thread task
 *      > returned by ExecutorService.submit
 *   - The key method is get
 *      > blocks until task completes
 *      > returns Callable interface result
 *      > throws Callable interface exception
 *
 */

class Adder implements Callable <Integer> {
    private String inFile, outFile;
    public Adder(String inFile) {...}
    public int doAdd() throws IOException {
        int total = 0;
        String line = null;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile)))
        {
            while((line = reader.readLine()) != null)
                total += Integer.parseInt(inline);
        }

        return total;
    }
    public Integer call() throws IOException {
        return doAdd();
    }
}

// multiple threads implementation
String[] inFiles = {"./file1.txt", ... "./file6.txt"};
ExecutorService es = Executors.newFixedThreadPool(3);
Future<Integer>[] results = new Future[inFiles.length];

for(int 1=0; i<inFiles.length; i++){
    Adder adder=new Adder(inFiles[i],outFiles[i]);
    results[i] = es.submit(adder);
}

for(Future<Integer> result:results) {
    try {
        int value = result.get();   // blocks until return value available
        System.out.println("Total: " + value);
    }
    catch (ExecutionException e){ // Exception raised in Adder}
        Throwable adderEx=e.getCause(); // get the Adder exception
        // do something with adderEx
    }
    catch (Exception e) {...} // non-Adder exceptions
}