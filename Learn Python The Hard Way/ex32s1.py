FIRST = 'st'
SECOND = 'nd'
THIRD = 'rd'
OTHERS = 'th'

birthday = range(1,29)


for i in birthday:
    if i > 3:
        if i == 21:
            postfix = FIRST
        elif i == 22:
            postfix = SECOND
        elif i == 23:
            postfix = THIRD
        else:
            postfix = 'th'
    elif i == 3:
        postfix = THIRD
    elif i == 2:
        postfix = SECOND
    elif i == 1: 
        postfix = FIRST 
    print "So far, I've had my %d%s birthday. " %(i,postfix)

print "Wow, that's a lot of birthdays!"
