from sys import argv

script, user_name = argv      # when run, need to input username: python ex14.py BarbieQ
prompt = '>'

print "Hi %s, I'm the %s script." % (user_name, script)  # %s means string
print "I'd like to ask you a few quesrions."
print "Do you like me %s?" % user_name
likes = raw_input(prompt)                   #shows promt '>', then input whatever

print "Where do you live %s?" % user_name
lives = raw_input(prompt)                  #change prompt into 'lives'

print "What kind of computer do you have?"
computer = raw_input(prompt)               #change prompt into 'computer'

print """
Alright, so you said %r about liking me.
You live in %r. Not sure where that is.
And you have a %r computer. Nice.
""" % (likes, lives, computer)          # %r shows whatever you want
