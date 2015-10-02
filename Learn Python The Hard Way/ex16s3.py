from sys import argv

script,filename = argv

txt = open(filename)

print "Here's your file %r:" %filename     #with %r,filename shows up with ''; if use %s,filename shows without ''.
print txt.read()

print "Input the filename again:"
file_again = raw_input(">>")   # can read another existing file if input that file's name here

txt_again = open(file_again)   #have to open file before reading!

print txt_again.read()
