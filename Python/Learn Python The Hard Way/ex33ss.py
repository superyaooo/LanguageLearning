def loop(max,increment):
    i = 0
    numbers = []
    while i < max:
        print "At the top i is %d" % i
        numbers.append(i)

        i = i + increment
        print "Numbers now:",numbers
        print "At the bottom i is %d" % i

    print "The numbers:"
    for num in numbers:
        print num



loop(16,3)  
