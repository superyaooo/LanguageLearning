import java.util.Scanner;

/**
 * Given a square matrix of size N*N, calculate the absolute difference between
 * the sums of its diagonals.
 *
 * Input Format:
 * The first line contains a single integer, N. The next N lines denote the
 * matrix's rows, with each line containing N space-separated integers
 * describing the columns.
 *
 * Output Format:
 * Print the absolute difference between the two sums of the matrix's
 * diagonals as a single integer.
 *
 * Sample Input:
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 *
 * Sample Output:
 * 15
 *
 * Explanation:
 * The primary diagonal is:
 * 11
 * * 5
 * * * -12
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 *
 * The secondary diagonal is:
 * * * 4
 * * 5
 * 10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 *
 * Difference: |4 - 19| = 15
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] squareMtx = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                squareMtx[i][j] = in.nextInt();
            }
        }

        int sumA = 0;
        int sumB = 0;
        for(int n=0; n<size; n++){
            sumA += squareMtx[n][n];

            int m = size-1-n;
            sumB += squareMtx[n][m];
        }

        System.out.print(Math.abs(sumA-sumB));
    }
}
