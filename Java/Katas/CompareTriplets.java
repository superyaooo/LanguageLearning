import java.util.Scanner;

/**
 * Alice and Bob each created one problem for HackerRank.
 * A reviewer rates the two challenges, awarding points on a scale from 1 to 100
 * for three categories: problem clarity, originality, and difficulty.
 *
 * We define the rating for Alice's challenge to be the triplet A = (a0, a1, a2),
 * and the rating for Bob's challenge to be the triplet B = (b0, b1, b2).
 *
 * Your task is to find their comparison scores by comparing a0 with b0,
 * a1 with b1, and a2 with b2.
 *
 * * If ai>bi, then Alice is awarded 1 point.
 * * If ai<bi, then Bob is awarded 1 point.
 * * If ai=bi, then neither person receives a point.
 *
 * Given A and B, can you compare the two challenges and print their respective
 * comparison points?
 *
 * Input Format:
 * The first line contains 3 space-separated integers, a0, a1, and a2, describing
 * the respective values in triplet A.
 * The second line contains 3 space-separated integers, b0, b1, and b2, describing
 * the respective values in triplet B.
 *
 * Constraints:
 * * 1<= ai <= 100
 * * 1<= bi <= 100
 *
 * Output Format:
 * Print two space-separated integers denoting the respective comparison scores
 * earned by Alice and Bob.
 *
 * Sample Input:
 * 5 6 7
 * 3 6 10
 *
 * Sample Output:
 * 1 1
 *
 * Explanation:
 * In this example:
 * A=(a0, a1, a2)=(5,6,7)
 * B=(b0, b1, b2)=(3,6,10)
 *
 * Now, let's compare each individual score:
 * a0>b0, so Alice receives 1 point.
 * a1=b1, so nobody receives a point.
 * a2<b2, so Bob receives 1 point.
 * Alice's comparison score is 1, and Bob's comparison score is 1.
 * Thus, we print 1 1 (Alice's comparison score followed by Bob's
 * comparison score) on a single line.
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] alice = {a0, a1, a2};
        int aScore = 0;
        int[] bob = {b0, b1, b2};
        int bScore = 0;

        for(int i=0; i<3; i++){
            int result = Integer.compare(alice[i], bob[i]);
            if(result == 1)
                aScore +=1;
            else if(result == -1)
                bScore +=1;
        }

        System.out.print(aScore);
        System.out.print(" ");
        System.out.print(bScore);
    }
}
