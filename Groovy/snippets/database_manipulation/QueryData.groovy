@GrabConfig(systemClassLoader=true)
@Grapes([
    @Grab('mysql:mysql-connector-java:5.1.26')
    ])

import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/gps",
    "root", "root", "com.mysql.jdbc.Driver")

sql.eachRow('select * from routepoints') {
    println "Latitude: ${it.latitude}, Longitude: ${it.longitude}, " +
        "Timestep: ${it.timestep}"
}

def row = sql.firstRow('select latitude,longitude from routepoints')
println "Latitude: ${row.latitude}, Longitude: ${row.longitude}"

sql.close()
