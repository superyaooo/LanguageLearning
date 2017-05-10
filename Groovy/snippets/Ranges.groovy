// range from 1 to 10
def numbers = 1..10
for (num in numbers) {
    println num
}

// range from 'a' to 'g'
def letters = 'a'..'g'
for (letter in letters) {
    println letter
}

// range from enums
def enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}
def weekdays = DAYS.MON..DAYS.FRI
for (day in weekdays) {
    println day
}

println "Extends: "
// from & to in range
println weekdays.from
println weekdays.to