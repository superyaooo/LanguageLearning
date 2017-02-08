/**
 * StringJoiner
 *
 */


StringJoiner sj = new StringJoiner(", ");
sj.add("alpha");
sj.add("theta");
String theResult = sj.toString();

// chaining
sj.add("alpha").add("theta").add("gamma");
String theResult = sj.toString();

// with Start and End values
StringJoiner sj = new StringJoiner(", ", "{", "}");
sj.add("alpha");
sj.add("theta");
String theResult = sj.toString();  //output: {alpha, theta}

// Empty handling - when "add" is never called
StringJoiner sj1 = new StringJoiner(", ");
sj1.setEmptyValue("EMPTY");
String theResult1 = sj1.toString();  //output: EMPTY

StringJoiner sj2 = new StringJoiner(", ", "{", "}");
sj2.setEmptyValue("EMPTY");
String theResult2 = sj2.toString();  //output: EMPTY

// Empty handling - when "add" is called
StringJoiner sj1 = new StringJoiner(", ");
sj1.setEmptyValue("EMPTY");
sj1.add("");
String theResult1 = sj1.toString();  //output:  

StringJoiner sj2 = new StringJoiner(", ", "{", "}");
sj2.setEmptyValue("EMPTY");
sj2.add("");
String theResult2 = sj2.toString();  //output: {}