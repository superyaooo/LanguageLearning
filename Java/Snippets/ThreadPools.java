/**
 * Thread Pool Types
 *
 *  ExecutorService Interface:
 *   - Models thread pool behavior
 *   - Can submit tasks
 *   - Request and wait for pool shutdown
 *
 *  Executors Class:
 *   - Methods for creating thread pools
 *      > dynamically sized pools
 *      > size limited pools
 *      > pools that schedule tasks for later
 *
 */

class Adder implements Runnable {
    private String inFile, outFile;
    public Adder(String inFile, String outFile) {...}
    public void doAdd() throws IOException {...}
    public void run() {
        try {
            doAdd();
        } catch (IOException e) {...}
    }
}

// multiple threads implementation
String[] inFiles = {"./file1.txt", ... "./file6.txt"};
String[] outFiles = {"./file1.out.txt", ... "./file6.out.txt"};
ExecutorService es = Executors.newFixedThreadPool(3);

for(int 1=0; i<inFiles.length; i++){
    Adder adder=new Adder(inFiles[i],outFiles[i]);
    es.submit(adder);
}

try {
    es.shutdown();
    es.awaitTermination(60, TimeUnit.SECONDS);
} catch (Exception e) {...}
