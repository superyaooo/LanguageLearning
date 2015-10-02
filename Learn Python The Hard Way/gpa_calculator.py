print "Hi,Yao! Let's calculate the students' GPA!"

LS_grade = float(raw_input ("What is the LS grade?"))   # define variable with a string and input, no need to use "print" here.
G_grade = float(raw_input ("What is the G grade?"))     # double (()) works
RW_grade = float(raw_input ("What is the RW grade?"))    
Fin_grade = float(raw_input ("What is the Final exam grade?"))  
# raw_input deals with string. needs to be converted into a floating point number

Avg_grade = float((LS_grade*1 + G_grade*2 + RW_grade*2 + Fin_grade*2)/7)
                 # the outer () here is not necessary 


print ("The student's GPA is:"),Avg_grade   # allows to show the variable directly
