/*
* * Task
* Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).
*
* * Input Format
* A single integer, N (the argument to pass to factorial).
*
* * Output Format
* Print a single integer denoting N!.
*
* * Sample Input
* 3
** Sample Output
* 6
*
* * Explanation
* Consider the following steps:
* 1. factorial(3) = 3 * factorial(2)
* 2. factorial(2) = 2 * factorial(1)
* 3. factorial(1) = 1
* From steps 2 and 3, we can say factorial(2) = 2 * 1 = 2; then when we apply the value
* from factorial(2) to step 1, we get factorial(3) = 3 * 2 * 1 = 6.
* Thus, we print 6 as our answer.
*/

public class Solution {

    static int factorial(int n) {
        if(n>1) {
            return n*factorial(n-1);
        }
        else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
