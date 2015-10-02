from sys import argv

script, filename = argv

print """
Do you want to erase %r?
\nIf no, hit CTRL-C.     
\n\tIf yes, hit RETURN.
""" %filename                #inside """, actuall TAB and RETURN for space and new lines work as fine as \n and \t; not it is '\n' not '/n'!!!!!!!  

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
target.write(line1)
target.write(line2)
target.write(line3)  #lines will appear one after another without creating a new line if there's no 'target.write(/n)'

target.close()



