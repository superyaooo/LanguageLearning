from sys import argv
from os.path import exists

script,from_file,to_file = argv

input = open(from_file)
indata = input.read()

output = open(to_file,'w')
output.write(indata) 

output.close()
input.close()

print "copying %s to %s...\nand done!" % (from_file,to_file) #direct copying without asking user or checking if file exists
