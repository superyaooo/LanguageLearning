print "You enter a dark room with two doors. Do you go through door #1, door #2 or door #3?"

door = raw_input(">")

if door == "1":
    print "There's a giant bear here eating a cheese cake. What do you do?"
    print "1. Take the cake."
    print "2. Scream at the bear."

    bear = raw_input(">")

    if bear == "1":
        print "The bear eats your face off. Good job!"
    elif bear == "2":
        print "The bear eats your legs off. Good job!"
    else:
        print "Well, doing %s is probably better. Bear runs away." % bear

elif door == "2":
    print "Your stare into the endless abyss at Cthuhlu's retina."
    print "1. Blueberries."
    print "2. Yellow jacket clothespins."
    print "3. Understanding revolvers yelling melodies."

    insanity = raw_input(">")

    if insanity == "1" or insanity == "2":
        print "Your body survives powered by a mind of jello. Good job!"
    else:
        print "The insanity rots your eyes into a pool of muck. Good job!"

elif door == "3":
    print """
    There's a tunnel and at the end of the tunnel there's light. What do you want to do?
    1. Shut the door and run away.
    2. Walk through the tunnel.
    """

    your_choice = raw_input(">")

    if your_choice == "1":      # don't forget the quotation marks!
        print "You get sucked in and die immediately. WoW."
    elif your_choice == "2":
        print """
        There's an ocean on the other side of the tunnel. You see a mermaid.
        1. The mermaid likes you.
        2. The mermaid is injured.
        """
        oh = raw_input(">")

        if oh == "1":
            print "You marry the mermaid. And you live happily ever after!"
        elif oh == "2":
            print "You saved the mermaid and she marries you and you live happily ever after!"
        else:
            print "You're casted a spell and turned into a sea shell."
    else:
        print "Ooops you step on shit and fall into it."
            

else:
    print "You stumble around and fall on a knife and die. Good job!"
