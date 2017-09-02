@GrabConfig(systemClassLoader=true)
@Grapes([
    @Grab('mysql:mysql-connector-java:5.1.26')
    ])

import groovy.sql.Sql

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/gps",
    "root", "root", "com.mysql.jdbc.Driver")

def newTemperature = 100
sql.executeUpdate("update routepoints set temperature = ${newTemperature}")

sql.close()
