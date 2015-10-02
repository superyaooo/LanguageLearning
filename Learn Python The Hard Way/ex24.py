print "Let's practice everything."
print 'You\'d need to know \'bout escapes with \\ that do \n newlines and \t tabs.' 
# single back slash '\' won't show when print. double slash shows as a single slash.

poem = """
\tThe lovely world
with logic so firmly planted
cannot discern \n the needs of love
nor comprehend passion from intuition
and requires an explanation
\n\t\twhere there is none.
"""                                 #define a variable, here it's a long string.

print "-------------------"
print poem                          #print the variable
print "-------------------"


five = 10 - 2 + 3 - 6                    
print "This should be five: %s" % five        

def secret_formula(started):           #define function 'secret_formula'
    jelly_beans = started * 500
    jars = jelly_beans / 1000
    crates = jars / 100
    return jelly_beans, jars, crates


start_point = 10000
beans, jars, crates = secret_formula(start_point)       #this line can be deleted. assign function to variables

print "With a starting point of: %d" % start_point
print "We'd have %d beans, %d jars, and %d crates." % secret_formula(start_point)
#secret_formula(start_point) can be replaced by (beans, jars, crates)


