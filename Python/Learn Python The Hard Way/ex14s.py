from sys import argv

script, user_name = argv
prompt = 'What you say?'           # prompt could be random things. it shows up at line 9,12,15.

print "Hi,%s!%s here :)" %(user_name,script)
print "Need to ask you some questions."
print "Do you eat pork,%s?" % user_name
pork = raw_input(prompt)

print "Do you like beef?"
beef = raw_input(prompt)

print "What do you think of %s?" % user_name
username = raw_input(prompt)     # if use 'user_name'to define variable here, then user_name becomes whatever you type in from now on.

print '''
Ok. So, you said %r to pork; %r to beef; and %r to %s.
''' %(pork,beef,username,user_name)
