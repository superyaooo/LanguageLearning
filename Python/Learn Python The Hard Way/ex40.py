cities = {'CA': 'San Francisco', 'MI': 'Detroit',
                      'FL': 'Jacksonville'}   # creates dictionary

cities['NY'] = 'New York'   # adds new stuff to dictionary
cities['OR'] = 'Portland'

def find_city(themap, state):
    if state in themap:
        return themap[state]
    else:
        return "Not found."


cities['_find'] = find_city  ## can be deleted

while True:
    print "State? (ENTER to quit)",
    state = raw_input("> ")

    if not state: break   # breaks the while-loop

    
    city_found = cities['_find'](cities, state)  # runs function 'find_city()'
                 ## can be changed into: city_found = find_city(cities, state)
    print city_found
