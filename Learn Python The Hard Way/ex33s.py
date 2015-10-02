def loop(max):
    i = 0
    numbers = []
    while i < max:
        print "At the top i is %d" % i
        numbers.append(i)

        i = i + 1
        print "Numbers now:",numbers
        print "At the bottom i is %d" % i

    print "The numbers:"
    for num in numbers:
        print num

    print "There are", max, "numbers on the list."
    return numbers #this line is not necessary if there's no "print" when calling function.
    

loop(6)  #if want to show return value, then need to be: print loop(6); if no return value, with print loop(6), shows extra line "none" as the return value
    
