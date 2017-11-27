/*
* * Bubble Sort
* This is a very simple sorting algorithm.
* Because it's also very inefficient, Bubble Sort is not practical for real-world use
* and is generally only discussed in an academic context.
*
* * * Task
* Given an array, a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numSwaps = 0;
        for(int i = 0; i < n; i++) {
            boolean swapped = false;

            for(int j = 0; j < n-1; j++) {
                if(a[j] > a[j+1]) {
                    int tempN = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tempN;

                    swapped = true;
                    numSwaps++;
                }
            }

            if(!swapped) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
