# experiment version 2

cities = {'CA': 'San Francisco', 'MI': 'Detroit',
                      'FL': 'Jacksonville'}   

cities['NY'] = 'New York'   
cities['OR'] = 'Portland'

for city in cities.items():
    print "City:", city


for state,city in cities.items():
    print "Places to move:", (state,city)
