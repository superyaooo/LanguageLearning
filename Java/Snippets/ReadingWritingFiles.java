/**
* Reading & Writing files with java.nio.file
*
* java.nio.file - preferred package for files
*/

// java.io.file classes - old way to process files; now deprecated
// Buffered Streams - used for efficiency, line break support
try(BufferedReader br = new BufferedReader(new FileReader("file1.txt"))){
	// do something
}


// Reading lines with BufferedReader
try(BufferedReader br = Files.newBufferedReader(Paths.get("data.txt"))){
	String line = null;
	while((line = br.readLine()) != null){
		// do something
	}
}

// Read all lines
List<String> lines = Files.readAllLines(Paths.get("data.txt"));
for(String line:lines)
	System.out.println(line);