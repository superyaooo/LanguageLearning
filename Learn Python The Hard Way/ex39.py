ten_things = "Apples Oranges Crows Telephone Light Sugar"

print "Wait there's not 10 things in that list, let's fix that."

stuff = ten_things.split(' ')  # need to add space between the quotation marks.
more_stuff = ["Day","Night","Song","Frisbee","Corn","Banana","Girl","Boy"]

while len(stuff) != 10:
    next_one = more_stuff.pop()   # removes and returns the last item in the list
    print "Adding:", next_one
    stuff.append(next_one)
    print "There's %d items now." % len(stuff)

print "There we go:", stuff

print "Let's do some things with stuff."

print stuff[1]
print stuff[-1]  # the last item in the list. Negative numbers count from the end towards the beginning.
print stuff.pop()
print ' '.join(stuff)  # need to add space between the quotation marks to give space between print-out words. Means: join 'stuff' with spaces between them.

print '#'.join(stuff[3:5])  # extracts a "slice" from the stuff list that is from element 3 to element 4, meaning it does not include element 5. It's similar to how range(3,5) would work.
