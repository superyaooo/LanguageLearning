numbers = []    #doesn't matter if this is inside or outside of the function loop()

def loop(max,increment):

    for i in range(0,max,increment):
        print "At the top i is %d" % i
        numbers.append(i)

        print "Numbers now:",numbers
        print "At the bottom i is %d" % (i+increment)

    print "The numbers:"
    for num in numbers:
        print num



loop(11,2)  
