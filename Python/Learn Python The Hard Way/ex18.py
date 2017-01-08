def print_two(*args):   #the colon : is very important!!!
    arg1,arg2 = args
    print "arg1: %r, arg2: %r" %(arg1,arg2)  #must indent to include as parts of the function.

def print_two_again(arg1,arg2):    #instead of (*args),can put(arg1,arg2) directly. 
    print "arg1: %r, arg2: %r" %(arg1,arg2)

def print_one(arg1):
    print "arg1: %r" % arg1

def print_none():
    print "I got nothin'."

print_two("Zed","Shaw")           #no indent here. calls/runs the functions.
print_two_again("Zed","Shaw")      
print_one("First!")
print_none()    
