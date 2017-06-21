// data pipes can be used to dynamically create/read test parameters
given:
...
expect:
...
where:
pictureFile << ["scenery.jpg","house.jpeg", "car.png ","sky.tiff", "dance_bunny.gif"]
validPicture << [ true, true, false, false, false]

where:
first << (20..80)
second << (-65..-5)
