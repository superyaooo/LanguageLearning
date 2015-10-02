i = 0    #assigns variable 
numbers = []    #creats an empty list

while i < 6:
    print "At the top i is %d" % i   #prints the starting number for i
    numbers.append(i)      #puts i into the list 'numbers'

    i = i + 1        #everytime i increments by +1
    print "Numbers now:", numbers     #prints out current list
    print "At the bottom i is %d" % i   #prints current 'i' after '+1'


print "The numbers:"

for num in numbers:
    print num         #prints all the numbers in the list when the loop ends
