import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * John Watson performs an operation called a right circular rotation on an
 * array of integers, [a0, a1, ..., a(n-1)]. After performing one right circular
 * rotation operation, the array is transformed from [a0, a1, ..., a(n-1)] to
 * [a(n-1), a0, ..., a(n-2)].
 *
 * Watson performs this operation k times. To test Sherlock's ability to identify
 * the current element at a particular position in the rotated array, Watson asks
 * q queries, where each query consists of a single integer, m, for which you
 * must print the element at index m in the rotated array (i.e., the value of a(m)).
 *
 * Input Format:
 * The first line contains 3 space-separated integers, n, k, and q, respectively.
 * The second line contains n space-separated integers, where each integer i
 * describes array element a(i) (where 0<=i<n).
 * Each of the  subsequent lines contains a single integer denoting .
 *
 * Constraints:
 * 1 <= n <= 10^5
 * 1 <= a(i) <= 10^5
 * 1 <= k <= 10^5
 * 1 <= q <= 500
 * 0 <= m <= n-1
 *
 * Output Format:
 * For each query, print the value of the element at index m of the rotated
 * array on a new line.
 *
 * Sample Input:
 * 3 2 3
 * 1 2 3
 * 0
 * 1
 * 2
 *
 * Sample Output:
 * 2
 * 3
 * 1
 *
 * Explanation:
 * After the first rotation, the array becomes [3, 1, 2].
 * After the second (and final) rotation, the array becomes [2, 3, 1].
 *
 * Let's refer to the array's final state as array b. For each query, we just
 * have to print the value of b(m) on a new line:
 * * m = 0, so we print 2 on a new line.
 * * m = 1, so we print 3 on a new line.
 * * m = 2, so we print 1 on a new line.
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // size of array
        int k = in.nextInt();   // rotations
        int q = in.nextInt();   // queries
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        List<Integer> aList = new ArrayList<>();
        for(int num:a){
            aList.add(num);
        }
        for(int j = 1; j<=k; j++){
            int lastN = aList.get(n-1);
            aList.add(0, lastN);
            aList.remove(n);
        }
        int[] newA = aList.stream().mapToInt(i->i).toArray();

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(newA[m]);
        }
    }
}
