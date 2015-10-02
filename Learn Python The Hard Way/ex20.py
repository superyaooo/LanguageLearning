from sys import argv

script, input_file = argv

def print_all(f):
    print f.read()  #defines function; this function prints out file by reading it.

def rewind(f):
    f.seek(0)  #sets the file's current location; (0) points to the beginning of the file, any read or write will happen from the beginning. If seek(20), skipps the first 20 bytes, any read or write will happen from the 21st.

def print_a_line(line_count, f):
    print line_count, f.readline() #prints line number and the content of the line by .readline()

current_file = open(input_file)  #opens the file

print "First let's print the whole file:\n"

print_all(current_file)  #runs function, prints the whole file

print "Now let's rewind, kind of like a tape."

rewind(current_file)  #points to the beginning of the file by .seek(0)

print "Let's print three lines:"

current_line = 1  #starts the line number as 1
print_a_line(current_line, current_file) #runs function, prints line number, and the content; in this case, prints "1" and the content of the first line because of .seek(0)

current_line = current_line + 1
print_a_line(current_line, current_file) #line number shows up 2, runs to the next line

current_line = current_line + 1
print_a_line(current_line, current_file) #runs to the next line, line number shows as 3

