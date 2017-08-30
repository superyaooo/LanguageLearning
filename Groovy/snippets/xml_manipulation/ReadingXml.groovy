/*
XmlParser - eager evaluation;
          - entire doc loaded into memory before read, not ideal for large documents
XmlSlurper - lazy evaluation;
           - only portions loaded into memoery before read; better for large documents
*/
def file = new File('/data/fells_loop.gpx')

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

// get elements value of xml
println gpx.name    // print out <name> value of xml
println gpx.desc    // print out <desc> value of xml
// get attributes value of xml
println gpx.@version
println gpx.@creator
// get children elements
gpx.rte.rtept.each {
    println it.@lat
    println it.@lon
    println it.time
}
