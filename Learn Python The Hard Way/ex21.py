def add(a, b):      #defines function add(a, b), a and b are arguments
    print "ADDING %d + %d" % (a, b)  
    return a + b     #returns the value of 'a+b'

def subtract(a, b):
    print "SUBTRACTING %d - %d" % (a, b)
    return a - b

def multiply(a, b):
    print "MULTIPLYING %d * %d" % (a, b)
    return a * b

def divide(a, b):
    print "DIVIDING %d / %d" % (a, b)
    return a / b


print "Let's do some math with just functions!"

age = add(30, 5)               #assigns function to a variable
height = subtract(78, 4)
weight = multiply(90, 2)
iq = divide(100, 2)

print "Age: %d, Height: %d, Weight: %d, IQ: %d" % (age, height, weight, iq)
             #shows variabls, as a result of running the functions


# A puzzle for the extra credit, type it in anyway.
print "Here is a puzzle."

what = add(age, subtract(height, multiply(weight, divide(iq, 2))))  
          #uses variables in functions

print "That becomes: ", what, "Can you do it by hand?"    #runs fuctions and prints variable

