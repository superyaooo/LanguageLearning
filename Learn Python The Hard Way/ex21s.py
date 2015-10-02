def divide(a, b):
    print "dividing %d / %d" % (a, b)    
         #doesn't print anything if without; doesn't affect the calculation of the function
    return a / b

def multiply(a, b):
    print "multiplying %d * %d" % (a, b)
    return a * b

def subtract(a, b):
    print "subtracting %d - %d" % (a, b)
    return a - b

def add(a, b):
    print "adding %d + %d" % (a, b)
    return a + b

age = add(23, 5)    #runs function, and prints what's in function
weight = multiply(55, 2)
height = subtract(180, 20)
iq = divide(300,2)

print "Here's my info: age %d, iq %d, weight %d, height %d" % (age, iq, weight, height)


what = height - iq/2 * weight + age     #with or without () is the same,  (iq/2)*weight
print "And here's the result from the weird formula you ask for:", what

