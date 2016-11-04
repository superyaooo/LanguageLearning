/* Given an array of integers, every element appears twice except for one. Find that single one.
*
*  Note:
*  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*******************************************************************************************
*  bitwise operation:
*      ^    - (bitwise XOR) Binary XOR Operator copies the bit if it is set in one operand but not both.
*/


public class Solution {
    public int SingleNumber(int[] nums) {
        int singleNum = 0;
        foreach(int i in nums){
            singleNum ^= i;
        }
        
        return singleNum;
    }
}