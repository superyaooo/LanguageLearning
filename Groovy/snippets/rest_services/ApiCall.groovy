@Grapes([
    @Grab(
        group='org.codehaus.groovy.modules.http-builder',
        module='http-builder',
        version='0.6'
        )
    ])
import groovyx.net.http.RESTClient

def file = new File('../xml_manipulation/data/fells_loop.gpx')

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

// use  RESTClient to create new api client
def forecastApi = new RESTClient('https://api.darksky.net/')

// use ConfigSlurper to store config data
def crentialsFile = new File('credentials.groovy')
def configSlurper = new ConfigSlurper()
def credentials = configSlurper.parse(crentialsFile.toURL())

gpx.rte.rtept.each {
    println it.@lat
    println it.@lon

    def queryString = "forecast/${credentials.apiKey}/${it.@lat},${it.@lon},${it.time}"
    // make api call
    def response = forecastApi.get(path: queryString)

    println "${response.data.currently.summary}"
    println "${response.data.currently.temperature} degrees"
}
