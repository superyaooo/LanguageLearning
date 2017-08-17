/*
* * Task
* Given a base- integer, , convert it to binary (base-). Then find and print the base-10 integer
* denoting the maximum number of consecutive 's in 's binary representation.
*
* * Input Format
* A single integer, n.
*
* * Output Format
* Print a single base-10 integer denoting the maximum number of consecutive 1's in the
* binary representation of n.
*
* * Sample Input 1
* 5
* * Sample Output 1
* 1
*
* * Sample Input 2
* 13
* * Sample Output 2
* 2
*
*
* * Explanation
* Sample Case 1:
* The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.
*
* Sample Case 2:
* The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] oneArr = Integer.toBinaryString(n).split("[0]+");  // split string to string array using regex
        int counter = 0;
        for(String str : oneArr) {
            if(str.length()>counter) {
                counter = str.length();
            }
        }
        System.out.println(counter);
    }
}
