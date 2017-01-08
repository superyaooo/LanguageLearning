cars = 100
space_in_a_car = 4.0            # _ is an underscore character
drivers = 30
passengers = 90                  #use variabls to define numbers, or other varibales
cars_not_driven = cars - drivers  
cars_driven = drivers
carpool_capacity = cars_driven * space_in_a_car    # use variables in another variable
average_passengers_per_car = passengers / cars_driven


print "there are", cars, "cars available." #use variables instead of writing down numbers
print "there are only", drivers, "drivers available."
print "there will be", cars_not_driven, "empty cars today."
print "we can transport", carpool_capacity, "people today."
print "we have", passengers, "to carpool today."
print "we need to put about", average_passengers_per_car, "in each car."
