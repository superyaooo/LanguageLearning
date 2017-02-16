/**
 * Runnable Interface for threading support
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

// single thread implementation
String[] inFiles = {"./file1.txt", ... "./file6.txt"};
String[] outFiles = {"./file1.out.txt", ... "./file6.out.txt"};

for(int 1=0; i<inFiles.length; i++){
    Adder adder = new Adder(inFiles[i], outFiles[i]);
    Thread thread = new Thread(adder);
    thread.start();
}

// multiple threads implementation
String[] inFiles = {"./file1.txt", ... "./file6.txt"};
String[] outFiles = {"./file1.out.txt", ... "./file6.out.txt"};
Thread[] threads = new Thread[inFiles.length];

for(int 1=0; i<inFiles.length; i++){
    Adder adder = new Adder(inFiles[i], outFiles[i]);
    Thread threads[i] = new Thread(adder);
    threads[i].start();
}

for(Thread thread:threads)
    thread.join();  // blocks waiting for thread completion
