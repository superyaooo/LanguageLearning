REFRAIN = '''
%d bottles of beer on the wall,
%d bottles of beer,
take one down, pass it around,
%d bottles of beer on the wall!
'''     # assigns a long string to a short name

bottles_of_beer = 99
while bottles_of_beer > 1:
    print REFRAIN % (bottles_of_beer, bottles_of_beer, bottles_of_beer - 1)
    bottles_of_beer -= 1  # current number minus 1. i = i - 1
