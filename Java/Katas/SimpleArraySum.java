import java.util.Scanner;

/**
 * Given an array of N integers, can you find the sum of its elements?
 *
 * Input Format:
 * The first line contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers representing the
 * array's elements.
 *
 * Output Format:
 * Print the sum of the array's elements as a single integer.
 *
 * Sample Input:
 * 6
 * 1 2 3 4 10 11
 *
 * Sample Output:
 * 31
 *
 * Explanation:
 * We print the sum of the array's elements, which is:
 * 1 + 2 + 3 + 4 + 10 + 11 =3 1.
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for(int n:arr){
            sum += n;
        }

        System.out.print(sum);
    }
}
