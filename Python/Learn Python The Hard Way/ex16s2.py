from sys import argv

script, filename = argv

print """
Do you want to erase %r?
    If no, hit CTRL-C.
    If yes, hit RETURN.
""" %filename                #inside """, no need to use /n or /t, just do actuall TAB and RETURN for space and new lines; everything inside """ shows up as you type it.

raw_input("So?")

print """
Opening the file.....
Truncating the file....Voila!
"""

target = open(filename,'w') #doesn't work without 'w'
target.truncate()

print "Now what are the three lines you want to write?"
line1 = raw_input("line 1:")
line2 = raw_input("line 2:")
line3 = raw_input("line 3:")  

print "K let's write dis to da file and close it!"
target.write('%s\n%s\n%s\n'%(line1,line2,line3))  
#target.write(line1 + "\n" + line2 + "\n" + line3 + \n) works too!  This combines the six write() commands into one.
# the text will apprear with '' in the file if use %r instead of %s.

target.close()



