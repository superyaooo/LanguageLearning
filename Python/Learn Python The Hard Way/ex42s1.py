class TheThing(object):          # defines a class, 'object' and 'self' are required
    def __init__(self):         
        self.number = 0         # sets up class with interval variables

    def some_function(self):
        print "I got called."

    def add_me_up(self, more):
        self.number += more
        return self.number

a = TheThing()          # don't forget the ()
b = TheThing()

a.some_function()
b.some_function()

print a.add_me_up(20)
print a.add_me_up(20)
print b.add_me_up(30)
print b.add_me_up(30)

print a.number
print b.number
