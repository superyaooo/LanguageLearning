// Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

// Example:
// Given a = 1 and b = 2, return 3.

/* Given two numbers a and b, a&b returns the number formed by '1' bits on a and b. When it is left shifted by 1 bit, it is the carry.
*
*  For example, given a=101 and b=111 (in binary), the a&b=101. a&b << 1 = 1010.
*
*  a^b is the number formed by different bits of a and b. a&b=10.
*/



public class Solution {
    public int GetSum(int a, int b) {
        while(b!=0){
            int carry = a&b;     // AND of two bits
            a = a^b;           // SUM of two bits is A XOR B
            b = carry<<1;      // shifts carry to 1 bit to calculate sum
        }
        return a;
    }
}