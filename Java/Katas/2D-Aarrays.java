/*
* Context
Given a 6x6 2D Array, A:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
a b c
  d
e f g

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

* Task
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

* Input Format
There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be
in the inclusive range of -9 to 9.

* Output Format
Print the largest (maximum) hourglass sum found in A.

* Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

* Sample Output
19

* Explanation
A contains the following hourglasses:
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum (19) is:
2 4 4
  2
1 2 4
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        List<Integer> sumList = new ArrayList<>();
        for(int n=0; n<4;n++) {
            for(int m=0; m<4;m++) {
                int sum = arr[n][m] + arr[n][m+1] + arr[n][m+2] +
                    arr[n+1][m+1] +
                    arr[n+2][m] + arr[n+2][m+1] + arr[n+2][m+2];

                sumList.add(sum);
            }
        }

        System.out.println(Collections.max(sumList));     // use Collections.max() to get max value in a collection
    }
}
