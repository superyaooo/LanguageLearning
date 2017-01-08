from sys import argv

script, input_file = argv

def print_all(f):
    print f.read() #prints the content of the whole file by reading

def rewind(f):
    f.seek(0)  #points to the beginning of the file, every read/write starts here

def print_a_line(line_count, f):
    print line_count, f.readline() #prints the number you assign to the line, and the content of the line by reading the line .readline()

current_file = open(input_file)  #opens the file

print "First let's print the whole file:\n"

print_all(current_file)

print "Now let's rewind, kind of like a tape."

rewind(current_file)

print "Let's print three lines:"

current_line = 1  #assigns a number to the line, here the line shows as number 1
print_a_line(current_line, current_file) 
#prints the content of the first line by .readline(); when assigns 2 or any other number to the line, the content still will be the first line because of .seek(0)

current_line = current_line + 1  #line number adds up by 1
print_a_line(current_line, current_file) #line number +1, and the content of actual line2.

current_line = current_line +1
print_a_line(current_line, current_file)

