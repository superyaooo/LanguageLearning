I_want = "I want to be healthy."
I_need = "I need to practise Yoga!"
I_should = "I should do Yoga %d times a day."    # %d means integer
in_a_year = "In a year, I'll practice Yoga %r times in total."  # %r shows floating numbers, or whatever
time = 2.0  

print I_want
print I_need 
print I_should % time               # NO COMMA before %.  If 'time' not defined, could use 2.0 directly.
print in_a_year % (365*time)     # If no (),prints 365 twice. If 'time' not defined, use 2.0 to replace.

print """
\t ***Horray***
\n\tI'm \\so\\ happy!      
"""                           # first a new line, then TAB. --->this # cannot be in between the """s. 
