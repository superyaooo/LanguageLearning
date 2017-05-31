/* iterate through each element */
(1..3).each({ 
    println "In a closure: ${it + 1}"
})

// override default 'it' with 'i'
(1..3).each({ i -> 
    println "In a closure: ${i * 2}"
})


/* find all that matches */
(1..10).findAll({ it%2 == 0 }).each({ println "$it is an even number" })