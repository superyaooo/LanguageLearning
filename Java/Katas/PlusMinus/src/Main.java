import java.util.Scanner;

/**
 * Given an array of integers, calculate which fraction of its elements are
 * positive, which fraction of its elements are negative, and which fraction
 * of its elements are zeroes, respectively. Print the decimal value of each
 * fraction on a new line.
 *
 * Note: This challenge introduces precision problems. The test cases are
 * scaled to six decimal places, though answers with absolute error of up
 * to 1/10^4 are acceptable.
 *
 * Input Format:
 * The first line contains an integer, N, denoting the size of the array.
 * The second line contains N space-separated integers describing an array
 * of numbers (a0, a1, a2, ..., a(n-1)).
 *
 * Output Format:
 * You must print the following 3 lines:
 * * A decimal representing of the fraction of positive numbers in the array.
 * * A decimal representing of the fraction of negative numbers in the array.
 * * A decimal representing of the fraction of zeroes in the array.
 *
 * Sample Input:
 * 6
 * -4 3 -9 0 4 1
 *
 * Sample Output:
 * 0.500000
 * 0.333333
 * 0.166667
 *
 * Explanation:
 * There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
 * The respective fractions of positive numbers, negative numbers and zeroes
 * are 3/6=0.500000, 2/6=0.333333 and 1/6=0.166667, respectively.
 *
 * */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        float pCounter = 0;
        float nCounter = 0;
        float zCounter = 0;

        for(int i=0; i<size; i++){
            int num = in.nextInt();
            int result = Integer.compare(num, 0);
            if(result == 1)
                pCounter += 1;
            else if(result == 0)
                zCounter += 1;
            else if(result == -1)
                nCounter += 1;
        }

        System.out.println(pCounter/size);
        System.out.println(nCounter/size);
        System.out.println(zCounter/size);
    }
}
