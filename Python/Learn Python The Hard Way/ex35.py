from sys import exit      #imports the exit()function to programme

def gold_room():
    print "This room is full of gold. How much do you take?"

    next = raw_input(">")
    if '0' in next or '1' in next:   #only checks if '0' or '1' is in the string; try next.isdigit() to replace ['0' in next or '1' in next], .isdigit()checks if it's a number
        how_much = int(next)      #convers string to integer
    else:
        dead("Man, learn to type a number.")

    if how_much < 50:            #compares input with number
        print "Nice, you're not greedy, you win!"
        exit (0)          #exits the programme
    else:
        dead("You greedy bastard!")


def bear_room():
    print "There is a bear here."
    print "The bear has a bunch of honey."
    print "The fat bear is in front of another door."
    print "How are you going to move the bear?"
    bear_moved = False

    while True:      #loop indefinitely until a break; while-loop runs when boolean condition is True. 
        next = raw_input(">")

        if next == "take honey":
            dead("The bear looks at you then pimp slaps your face off.")
        elif next == "taunt bear" and not bear_moved:  # bear_moved is False at first, in loop1.
            print "The bear has moved from the door. You can go through it now."
            bear_moved = True  # bear_moved becomes True here; makes the loop continue to run
        elif next == "taunt bear" and bear_moved:  #loop2,here bear_moved is already True in loop1, so if 'taunt bear'again in loop2, dead.
            dead("The bear gets pissed off and chews your crotch off.")
        elif next == "open door" and bear_moved:  #loop2,goes to gold_room
            gold_room()
        else:
            print "I got no idea what that means."


def cthulu_room():
    print "Here you see the great evil Cthulu."       
    print "He, it, whatever stares at you and you go insane."
    print "Do you flee for your life or eat your head?"

    next = raw_input(">")

    if "flee" in next:
        start()       # runs function start()
    elif "head" in next:
        dead("Well that was tasty!")  # runs function dead()
    else:
        cthulu_room()     #runs function cthulu_room()


def dead(why):
    print why, "Good job!"
    exit(0)   #exits game/programme

def start():
    print "You are in a dark room."
    print "There is a door to your right and left."
    print "Which one do you take?"

    next = raw_input(">")

    if next == "left":
        bear_room()
    elif next == "right":
        cthulu_room()
    else:
        dead("You stumble around the room until you starve.")


start()   #calls function start(), runs it
        

            
