print "\\\\\\Let's play a game\\\\\\"   # only shows 3 slashes on each side, escape
print "How many fingers do you have?",
fingers = raw_input()
print "How many toes do you have?",
toes = raw_input()
print "\tOh my!\n\tso you have %r fingers, and %r toes!" %(
    fingers,toes) # \t means TAB,space after not needed; \n means a new line; \n\t could be put together.
