/**
 * Format Conversions
 *
 * d - Decimal (Integral)
 * o - Octal   (Integral)
 * x - Hex     (Integral)
 * f - Decimal  (Floating Point)   -> 123.000000
 * e - Scientific Notation   (Floating Point)   -> 1.230000e + 02
 * s - String   (General)
 *
 */

int a = 13, b = 1, c = 5;

String s = String.format("My dogs are %d, %d, and %d years old", a, b, c);

double avgDiff = ((a-b) + (c-b)) / 2.0d;

// returns value with 1 decimal digit
String s2 = String.format("Average age between each is %.1f years", avgDiff);



/**
 * Format Flags
 *
 *      #   0   -	,	space	+	(
 *
 */

// # include radix
String s1 = String.format("%d", 32);   // result: 32
String s2 = String.format("%o", 32);   // result: 40
String s3 = String.format("%x", 32);   // result: 20

String s4 = String.format("%#o", 32);   // result: 040
String s5 = String.format("%#x", 32);   // result: 0x20
String s6 = String.format("%#X", 32);   // result: 0X20


// 0 (zero-padding) and - (left justify)
s1 = String.format("W:%d X:%d", 5, 235);	// result:  W:5 X:235
s2 = String.format("W:%4d X:%4d", 5, 235)	// result:  W:   5 X: 235  (width 4)
s3 = String.format("W:%04d X:%04d", 5, 235)	// result:  W:0005 X:0235  (insert 0 instead of space)
s4 = String.format("W:%-4d X:%-4d", 5, 235)	// result:  W:5    X:235 	(spaces on the right)


// , (include grouping separator)
s1 = String.format("%d", 1234567); 		// result: 1234567
s2 = String.format("%,d", 1234567)		// result: 1,234,567
s3 = String.format("%,.2f", 1234567.0)	// result: 1,234,567.00

// space (leave space for positive numbers)
// + (always shown sign)
// ( (enclose negative values in parenthesis)
s1 = String.format("%d", 123);		// result: 123
s2 = String.format("%d", -456);		// result: -456

s3 = String.format("% d", 123);		// result:  123  (space in front of 123)
s4 = String.format("% d", -456);	// result: -456
s5 = String.format("%+d", 123);		// result: +123
s6 = String.format("%+d", -456);	// result: -456
s7 = String.format("%(d", 123);		// result: 123
s8 = String.format("%(d", -456);	// result: (456)
s9 = String.format("% (d", 123);	// result:  123



/**
 *	Argument Index
*/
s1 = String.format("%d %d %d", 100, 200, 300);		// result: 100 200 300

s2 = String.format("%$3d %$1d %$2d", 100, 200, 300);	// result: 300 100 200

s3 = String.format("%$2d %<04d %$1d", 100, 200, 300);	// result: 200 0200 100

