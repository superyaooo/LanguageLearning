class Animal(object):
    def food(self):
        print "What does it eat, grass or meat?"

        while True:
            eat = raw_input("> ")

            if eat == "grass":
                print "I don't eat meat. Meat is gross. Ewh!!!"
                exit()

            elif eat == "meat":
                print "Gimme meat!!! Rwarrrr!!!"
                exit()

            else:
                print "Huh?"
            

class Dog(Animal):
    def __init__(self,name):
        self.name = name

    def bark(self):
        print "Woof woof!!", self.name


class Cat(Animal):
    def __init__(self, name):
        self.name = name
        
    def meow(self):
        print "Meow Meow~~", self.name


class Person(object):
    def __init__(self, name):
        self.name = name
        self.pet = None

    def intro(self):
        print "My name is: ", self.name



class Employee(Person):
    def __init__(self, name, salary):
        super(Employee, self).__init__(name)
        self.salary = salary

    def income(self):
        print "My salary is: ", self.salary


rover = Dog("Rover")


satan = Cat("Satan")



mary = Person("Mary")
mary.pet = satan


mary.intro()
mary.pet.meow()


frank = Employee("Frank", 120000)
frank.pet = rover

frank.intro()
frank.pet.bark()  
frank.income()

not_human = Animal()
not_human.food()





