age = raw_input("How old are you?")        # quote marks required here, to show string. 
height = raw_input("How tall are you?")            # single quote is ok too.
weight = raw_input("How much do you weight?")

print "So, you're %r old, %r tall and %r heavy." % (
    age,height,weight)
