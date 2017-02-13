// use replaceAll()
String s1 = "apple, apple and orange please";
String s2 = s1.replaceAll("ple\\b", "ricot");	// result: apricot, apricot and orange please

// use split() and match method
String[] parts = s1.split("\\b");
/**
 * split string with word breaks
 *
 * result: "apple" 
 *		   " "
 *		   "and"
 *		   " "
 *         "orange"
 *         " "
 *         "please"
 *
 */


for(String thePart:parts){
	if(thePart.matches("\\w+"))
		System.out.println(thePart);
}
/**
 *	result: "apple"
 *			"apple"
 *			"and"
 *			"orange"
 *			"please"
*/



/**
 *	Dedicated Regular Expression Classes:
 *		Pattern
 *		Matcher
*/
Pattern pattern = Pattern.compile("\\w+");
Matcher matcher = pattern.matcher(s1);
while(matcher.find())
	System.out.println(matcher.group());

