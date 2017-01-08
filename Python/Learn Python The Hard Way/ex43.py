# My own game using classes. THE LITTLE MERMAID.

from sys import exit
import random


class GoingHome(object):

    def __init__(self):
        self.thoughts = [
            "Bet there're tons of fresh seaweed pie waiting for me at home...", 
            "Oh I wonder which episode of The Almighty Godfather Of The Sea is on tonight...",
            "There's no place like home...", 
            "The real happy land is sea land..."
        ]  # one item per line in this case in order to be able to pick every item

    def go_home(self):
        print random.choice(self.thoughts)
        return exit(0)

    def home_again(self):
        print random.choice(self.thoughts)
        print "Weeks have passed...You find yourself miss the prince more and more."
        print "Your merrrrrrr friends at the bar think there ain't no true love possible between you guys."
        print "But you still want to give it a try. Or just see his face again. Maaaaybe talk to him."
        print "There's only one person knows what to do in the Merrrr Kingdome."
        print "That is the witch-fish."
        print "Do you want to go see the witch-fish?"
        print """
        a. Yes!
        b. ehhh nevermind.
        """

        while True:
            decision = raw_input(">")
            if decision == 'a':
                goSeeWitch = SeaWitch()
                goSeeWitch.witch()

            elif decision == 'b':
                print "Meh. I'll just forget about it and hang out with my friends here cuz the witch-fish sounds scary."
                self.go_home()  # have to use 'self.' in order for it to work here.

            else:
                print "Hey! You need to decide what to do!"
                

class UnderTheSea(object):

    def daily(self):
        print "What name do you want to be addressed by?"
        name = raw_input("> ")
        
        print "Ok %s, you're a mermaid and you live in the splendid Merrrr Kingdom under the sea." % name
        print """
        Sometimes you swim to the top of the ocean and sing songs at night while gazing the stars.
        Sometimes you chase sea mice out of your home.
        Sometimes you drive away sharks to protect your sea corn from getting eaten. Those horrible sharks and sea mice.
        Sometimes you hang out with your merrrrrr friends at the Sea You Tomorrow bar.
        Sometimes you wonder if your life's ever gonna change...


        Then one day, you see a ship burning ship sinking.
        You decide to:
        a. go have a look
        b. ignore the ship cuz this kinda thing happens a lot anyways
        """

        while True:
            choice = raw_input("> ")
            
            if choice == 'a':
                goToShip = SinkingShip()
                goToShip.ship()
                
            elif choice == 'b':
                print "I'd rather go home and watch MerrrTV."
                goHome = GoingHome()
                goHome.go_home()

            else:
                print "Please make a choice."


class SinkingShip(object):

    def ship(self):
        print "You see a prince drowning..."
        print "What do you want to do?"
        print """
        a. take his golden crown and sword, then go home.
        b. save him.
        """

        while True:
            to_do = raw_input(">")

            if to_do == 'b':
                goToBeach = Beach()
                goToBeach.onthebeach()
            elif to_do == 'a':
                print "Going home..."
                home = GoingHome()
                home.go_home()
            else:
                print "You need to make a decision."


class Beach(object):
    def onthebeach(self):
        print "You set the prince down on the beach, then leave before he wakes up."
        headHome = GoingHome()
        headHome.home_again()



class SeaWitch(object):
    def witch(self):
        print """
        You come to the dark coral forest where the witch-fish resides.
        The witch-fish shows herself at your request.
        She already knows why you are here.
        But every magic comes with a price. To get what you want, you have to trade your pet jellyfish.
        Also with the traded legs, you can't walk or stand for too long or they'll start to hurt.
        Are you willing to trade your pet jellyfish with legs that can walk on human land?
        a. Yes. I'll just get another pet in the future.
        b. No. Nobody gets my pet jellyfish!
        """

        while True:
            voice = raw_input(">")
            if voice == 'a':
                human_land = PrincePalace()
                human_land.palace()
            elif voice == 'b':
                just_go_home = GoingHome()
                just_go_home.go_home()
            else:
                print "Hey! Show some respect and make a decision before the witch turns you into a jellyfish!"



class PrincePalace(object):
    def palace(self):
        print """
        The witch takes your pet jellyfish and casts a spell on you.
        You swim to the seashore and as your tail touches the sand it turns into two legs.
        Awwww legs!!!
        You put on the human clothes you've prepared and proceed to the palace.

        After the Prince's safe return, 
        the King decides to host dance balls at the palace every Monday and Friday night 
        for the Prince to choose a lady to marry and carry on the throne.
        
        It is Monday today and also a great chance for you to meet the Prince again.
        At night, you enter the palace dance hall to look for the Prince.
        
        The Prince sees you and introduces him to you and ask for a dance.
        You've walked for quite a while and your legs start to hurt a lot.
        Do you still agree to dance with the Prince right now?
        a. Yes! Yes! Of course!
        b. Oh...No. Not now. Tell the Prince you need a rest and will dance with him later.
        """

        while True:
            dance_or_not = raw_input(">")

            if dance_or_not == 'a':
                print """
                Every step hurts during the dance and you fall on the ground.
                The Prince carries you to a guest room in the palace and tells you to stay there until recover.
                Days have passed, he takes you to the royal gardon for walks and talks.
                
                He falls in love with you and asks you to be his Princess.
                Of course you say YES! 
                Since you've become Princess, you have your own royal carriage and don't need to walk on your legs for too long.
                Big winner!!!
                
                And you two live happily ever after.
                """

                exit(0)


            elif dance_or_not == 'b':
                print """
                The Prince walks away and dances with another beautiful lady, Princess Booobie from Booobie Land.
                They spend several dances together and the Prince never comes back to you for a dance.
                The next day, a notice comes out saying that the Prince is marrying Princess Booobie from Booobie Land.

                There's no point for you to stay even though you regret your desicion for resting before dancing.
                Now you want to go home.

                You go to the beach and summons the witch-fish.
                She tells you to get your tail back, you have to kill the Prince and trade with his royal heart.


                It's a tough decision cuz you still love the Prince but you also want to go back home.
                Finally you decide to trade your tail back.
                With the help from the witch, you enter the Prince room at night while he's asleep.

                You hold the dagger and point it to his heart.
                a. Stab the dagger.
                b. Throw the dagger away.
                """
                
                while True:
                    dagger = raw_input(">")
                    if dagger == 'a':
                        print "You get the Prince's heart and give it to the witch."
                        print "You get your tail back and swim home. Thinking never going elsewhere besides the sea."
                        home_forever = GoingHome()
                        home_forever.go_home()

                    elif dagger == 'b':
                        print """
                        You can't take the Prince's heart cuz you don't want to kill him.
                        You run away through the balcony and wonders what to do.

                        Then a fairy shows up and says she's gonna help you return home since you're a very nice person.
                        The dairy gives your tail back and you swim home happily...
                        Thinking never getting away from home again...
                        """
                        exit(0)

                    else:
                        print "Make a decision quick before the Prince wakes up!"


            else:
                print "Say something!"





class BeginHere(object):
    def __init__(self, start):
        self.start = start

    def play(self):
        SeaLife = UnderTheSea()
        next = self.start

        while True:
            room = getattr(SeaLife, next)
            next = room()


begin = BeginHere('daily')
begin.play()
                    
                    
                
        
        




        





