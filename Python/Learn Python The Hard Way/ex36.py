# This is my very own first game.

from sys import exit

bees_life = [1,0]
skeleton_life = [1,0]
cockroach_life = [1,0]
boss_life = [1,0]
mermaid_ball = [1,0]

weapons = ['lamp','sword']

def start():
    print "You have a lamp and a sword."
    print "In front you, there is a red door and a black door."
    print "Which door do you choose to open?"

    while True:
        choose_door = raw_input(">")   #has to be inside the loop to prevent dead loop.
        
        if 'red door' in choose_door:
            skeleton_room()
        elif 'black door' in choose_door:
            dark_room()
        else:
            print "Please choose a door."



def skeleton_room():

    while skeleton_life == [1,0]:
        print "There is a skeleton fighter infont of a green door."
        print "And there's the tunnel to a safer room maybe?"
        print "You can fight the skeleton fighter or flee through the tunnel. Do you fight or flee?"

        selection = raw_input(">")

        if selection == 'fight':
            print "What weapon do you use?"
            for wp in weapons:
                print wp
            
            weapon = raw_input(">")
            if weapon == 'sword':
                print """
                Great! You defeated the skeleton fighter. 
                You got the bug spray! DUN DUN DUN!!!
                Opening up the green door...
                """
                skeleton_life.remove(1)
                weapons.append('bug spray')
                cockroach_room()
            else:
                die("Wrong weapon. The skeleton fighter chopped you up.")
                    
        elif selection == 'flee':
            print "Running fast through the tunnel..."
            print "Hope the skeleton fighter doesn't catch you...heheh...."
            dark_room()
        else:
            die("The skeleton fighter caught you.")


    while skeleton_life == [0]:
        print "No skeleton fighter anymore."
        print """
        1-Explore the tunnel, 
        2-go through green door, or 
        3-starve to death?
        """
        
        select = raw_input(">")
        
        if select == '1':
            dark_room()
        elif select == '3':
            die("You starved for 7 days.")
        elif select == '2':
            cockroach_room()
        else:
            die("You didn't do anything. You starved to death anyways.")




def dark_room():
    print """
    Oh it's a bit dark here.
    Do you want to light your lamp?
    1-Yes
    2-No
    """
    lamp = raw_input(">")

    if lamp == '1':  
        print """
        There is a yellow door and a tunnel.
        Do you take the yellow door or the tunnel?
        1-yellow door
        2-tunnel
        """
        choose = raw_input(">")
        if choose == '1':
            bees_room()
        elif choose == '2':
            skeleton_room()
        else:
            print "Be a man and make a decision!"
    else:
        die("You stumble around and fell into a pithole.")




def cockroach_room():

    while cockroach_life == [1,0]:   
        print """
        OMG!!! There is a man-eating cockroach in front of the blue door! EWW! Gross!!!
        There is a tunnel to another room!!
        What do you do? Quick!
        1-flee through the tunnel
        2-fight the cockroach
        3-go through green door
        """
        quick_decision = raw_input(">")

        if quick_decision == '1':
            bees_room()
        elif quick_decision == '2':
            print "Choose a weapon!"
            for wp in weapons:
                print wp

            weapon = raw_input(">")
            if weapon == 'bug spray':
                print "You sprayed the shit out of the cockroach. It can't eat you anymore. It died."
                print "You just got the bug net!!! DUN DUN DUN!!!"
                cockroach_life.remove(1)
                weapons.append("bug net")

                print "What do you choose? 1-green door; 2-blue door; 3-go back through tunnel"
                door = raw_input(">")
                if door == '2':
                    mermaid_room()
                elif door == '1':
                    skeleton_room()
                elif door == '3':
                    bees_room()
                else:
                    print "Be a man and choose a color!"
            else:
                die("Wrong weapon! Ouch!")

        elif quick_decision == '3':
            skeleton_room()   
        else:
            die("I said quick!")


    while cockroach_life == [0]:
        print """
        No man-eating cockroach anymore!
        What do you choose?
        1-green door
        2-blue door
        3-tunnel
        """
        door = raw_input(">")
        if door == '1':
            skeleton_room()
        elif door == '2':
            mermaid_room()
        elif door == '3':
            bees_room()
        else:
            print "Be a man and choose your path!"



def bees_room():

    while bees_life == [1,0]:
        print """
        Oh no!! There are tons of bees infront of the purple door!!!
        What do you want to do?
        1.catch the bees
        2.flee through the tunnel
        3.open yellow door and run to another room
        """
        to_do = raw_input(">")

        if to_do == '2':
            cockroach_room()
        elif to_do == '3':
            dark_room()
        elif to_do == '1':
            print "Choose an item to catch the bees before they sting you to death!"
            for wp in weapons:
                print wp

            weapon = raw_input(">")
            if weapon == 'bug net':
                print """
                Wow! You caught all the bees! AND....
                You got a water ball! DUN DUN DUN!!!
                Proceed to the purple door....
                """
                bees_life.remove(1)
                weapons.append('water ball no.2')
                boss_room()
            else:
                die("Ah oh....the bees stung you...ouch!")
        else:
            print "Make a choice!"


    while bees_life == [0]:
        print "Oh good. No bees anymore!"
        print """
        Which path do you choose?
        1.purple door
        2.tunnel
        3.yellow door
        """

        path = raw_input(">")
        if path == '1':
            boss_room()
        elif path == '2':
            cockroach_room()
        elif path == '3':
            dark_room()
        else:
            print "You better choose a path before stucking in here forever...."
       


def mermaid_room():
    while mermaid_ball == [1,0]:
        print """
        A mermaid appears and hands you a water ball...DUN DUN DUN!!!
        Now what?
        1.blue door
        2.tunnel
        """
        weapons.append("water ball no.1")
        mermaid_ball.remove(1)

        now_what = raw_input(">")
        if now_what == '1':
            cockroach_room()
        elif now_what == '2':
            boss_room()
        else:
            print "Come on....move ya ass....the mermaid's not gonna marry you if you stay...."

    while mermaid_ball == [0]:
        print """
        The mermaid reappears and says:"Hey bro what d'ya want? Ain't no water ball left..."
        You better:
        1. tunnel
        2. blue door
        """
        better = raw_input(">")
        if better == '1':
            boss_room()
        elif better == '2':
            cockroach_room()
        else:
            print "You know she's not gonna marry you right? So choose your path..."


def boss_room():
    while boss_life == [1,0]:
        print """
        Oh....there's a puppy.....
        Hi,puppy!
        AW no!!! puppy starts to shoot fireball at ya!
        What do you do?
        1. run to another room through the tunnel
        2. open purple door and run to another room
        3. train it into a normal puppy -- to do this, you need two water balls.
        """

        to_do = raw_input(">")
        if to_do == '1':
            mermaid_room()
        elif to_do == '2':
            bees_room()
        elif to_do == '3':
            print """
            Ready?.....Go!
            Throw two water balls at the puppy.
            """
            if 'water ball no.1' and 'water ball no.2' in weapons:
                print "Great! The water balls put the fireballs off. Now the puppy is yours."
                boss_life.remove(1)
                print "What do you want to do now?"
                print "1. take the puppy and go home for dinner"
                print "2. take the puppy and explore the rooms again"

                final = raw_input(">")
                if final == '1':
                    print "A bright door appears on the wall....You may go home through this door..."
                    exit()
                else:
                    print "Seems you want to explore longer....."
                    print """
                    1. tunnel
                    2. purple door
                    """
                    further = raw_input(">")
                    if further == '1':
                        mermaid_room()
                    elif further == '2':
                        bees_room()
                    else:
                        print "Hey buddy! Choose your path."
            else:
                print "You need two water balls to train it!"
                print """
                1. keep training anyways
                2. tunnel to another room
                3. purple door to another room
                """
                decision = raw_input(">")
                if decision == '1':
                    die("You got hit by a fireball and burned to ashes....")
                elif decision == '2':
                    mermaid_room()
                elif decision == '3':
                    bees_room()
                else:
                    die("You got hit by a fireball and burned to ashes....")
        else:
            die("You got hit by a fireball and burned to ashes....")
            


    while boss_life == [0]:
        print """
        Puppy doesn't shoot fire anymore!
        Which way do you choose?
        1.door out to go home
        2.tunnel
        3.purple door
        """
        choose_again = raw_input(">")
        if choose_again == '1':
            print "OK...going home...."
            exit()
        elif choose_again == '2':
            mermaid_room()
        elif choose_again == '3':
            bees_room()
        else:
            print "AWWWWWWWWWWWW CAN'T YOU JUST MAKE A DESICION YOU PUSSY!!!"

    


def die(why):
    print "Oops...", why, "You just died :("
    exit()


start()
