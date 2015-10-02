#This programme creats a file, then allows you to write anything to the new file

from sys import argv

script, filename = argv  #creats any file you want, i.e, test.txt; or opens any current file

print "We're going to erase %r." % filename
print "If you don't want that, hit CTRL-C (^C)."  #exits the programme
print "If you do want that, hit RETURN."  #continue with the programme

raw_input ("?") # ? shows up, and system gets the decicion you make, exit/continue with your programme

print "Opening the file..."
target = open(filename, 'w')  #opens the file, allows it to be written by 'w'

print "Truncating the file. Goodbye!"
target.truncate() #empties/erases the file

print "Now I'm going to ask you for three lines."

line1 = raw_input("line 1: ")  #gets the new content you type in, assigns it to line1
line2 = raw_input("line 2: ")
line3 = raw_input("line 3: ")

print "I'm going to write these to the file."

target.write(line1) #writes line1's new content to the erased file
target.write("\n")  #creats a new line after each line
target.write(line2)
target.write("\n")
target.write(line3)
target.write("\n")

print "And finally, we close it."
target.close() #closes the file

