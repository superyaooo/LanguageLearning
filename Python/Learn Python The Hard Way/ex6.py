x = "There are %d types of people." % 10     # x is a string,and has a varibale.
binary = "binary"      # string
do_not = "don't"         
y = "Those who know %s and those who %s." % (binary, do_not) # y is a string that has two strings in it.

print x      # print string
print y

print "I said: %r." % x               
print "I also said: '%s'." % y  # print string y inside another string.

hilarious = False
joke_evaluation = "Isn't that joke so funny?! %r" # a string, the variable is not defined.

print joke_evaluation % hilarious # use 'hilarious' to define the varibale in 'joke_evaluation'

w = "This is the left side of..." # string
e = "a string with a right side."

print w + e       # print two strings together
