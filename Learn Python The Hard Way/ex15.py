from sys import argv

script, filename = argv       # get a filename.

txt = open(filename)            # open is a command/function.    define 'txt'.

print "Here's your file %r:" % filename
print txt.read()         # give file 'txt' a command 'read',by using '.', with no parameters.

print "I'll also ask you to type it again:"
file_again = raw_input(">")           # define 'file_again'. '>' is a prompt. this line asks for input.

txt_again = open(file_again)       # define 'txt_again', and assign command. this line opens input.

print txt_again.read()     # assign command 'read' to file 'txt_again'
