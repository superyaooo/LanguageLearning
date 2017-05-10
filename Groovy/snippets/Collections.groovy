/* 
*  - dollar sign $ only works in double quotes, not single quote
*  - to use on elements of collections, use {}, for example:
*           println "${doggies[0]}"
*/

def doggies = ["Woof", "Ruff", "Wraar"]
for(doggie in doggies) {
    def greeting = "Hello, "
    println "$greeting" + "$doggie"
}


