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
 *      #   0   -
 *
 */

// # include radix
String s1 = String.format("%d", 32);   // result: 32
String s2 = String.format("%o", 32);   // result: 40
String s3 = String.format("%x", 32);   // result: 20

String s4 = String.format("%#o", 32);   // result: 040
String s5 = String.format("%#x", 32);   // result: 0x20
String s6 = String.format("%#X", 32);   // result: 0X20