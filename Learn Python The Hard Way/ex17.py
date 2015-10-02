from sys import argv
from os.path import exists  #returns True if a file exists, False if not.

script,from_file,to_file = argv

print "Copying from %s to %s" % (from_file, to_file)

input = open(from_file)
indata = input.read()      #read from fileA,assign it to indata

print "The input file is %d bytes long" % len(indata)    #read the length of fileA

print "Does the output file exist? %r" % exists(to_file) #check if fileB exists
print "Ready, hit RETURN to continue, CTRL-C to abort."
raw_input()

output = open(to_file, 'w')
output.write(indata)    # write fileA to fileB through indata

print "Alright, all done."

output.close()
input.close()       # close both output and input files
