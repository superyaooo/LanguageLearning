@GrabConfig(systemClassLoader=true)
@Grapes([
    @Grab('mysql:mysql-connector-java:5.1.26')
    ])

import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/gps",
    "root", "root", "com.mysql.jdbc.Driver")

def routepoints = sql.dataSet("routepoints")
routepoints.add(latitude: 10203.00, longtitude: 492.01, timestep: new DateTime().now())

sql.close()
