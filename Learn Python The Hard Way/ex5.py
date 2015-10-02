my_name = 'Yao Wang'
my_age = 27
my_height_feet = 5.3
my_height_centimeter = 30.48*my_height_feet
my_weight = "a cecret."     # double quotes and single quotes both work.
my_eyes = 'black'
my_hair = 'black'

print "Let's talk about %s." % my_name    # %s means string
print "She's %r feet tall." % my_height_feet  # %r will show the floating number/whatever
print "That's %d centimeters." % my_height_centimeter  # %d means integer
print "Her weight is %s" % my_weight
print "She's got %s eyes and %s hair." % (my_eyes, my_hair)

print "If I add %d and %r, I get %d." % (my_age, my_height_feet, my_age + my_height_feet)

