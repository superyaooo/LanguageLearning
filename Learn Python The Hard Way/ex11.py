print "How old are you?",
age = raw_input()
print "How tall are you?",  # comma here, so no new line will be made.
height = raw_input()
print "How much do you weigh?",
weight = raw_input()

print "so, you're %r old, %r tall and %r heavy." % (   # %r shows whatever, if %d, then whole number needed, cannot match the string in the parenthesis. 
    age, height, weight)
