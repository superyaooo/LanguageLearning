/*
StreamingMarkupBuilder
    - advanced XML creation
    - better support for large documents
*/
def inFlie = new File('./data/fells_loop.gpx')  // '../data' if file is one level deeper
def slurper = new XmlSlurper()
def gpx = slurper.parse(inFlie)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind {
    // write xml
    route {
        mkp.comment(gpx.name)
        gpx.rte.rtept.each { point ->
            routepoint(timestamp: point.time.toString()) {
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}

def outFile = new File('./data/fells_loop_truncated.xml')
outFile.write(xml.toString())
