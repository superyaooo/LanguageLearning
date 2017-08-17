package com.java.katas;

import java.util.Scanner;

/**
 *
 *
 *
 Consider a staircase of size n = 4:

    #
   ##
  ###
 ####

 Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces.
 The last line is not preceded by any spaces.

 Write a program that prints a staircase of size n.

 Input Format:
 A single integer, n, denoting the size of the staircase.

 Output Format:
 Print a staircase of size n using # symbols and spaces.

 Note: The last line must have 0 spaces in it.

 Sample Input: 6
 Sample Output:

      #
     ##
    ###
   ####
  #####
 ######

 The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n = 6.
 *
 */

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

        String sign = "";
        for(int i=1; i<=n; i++){
            String space = "";
            for(int j=1; j<=n-i; j++){
                space += " ";
            }
            sign += "#";
            System.out.println(space+sign);
        }


        /*
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }

            System.out.println();
        }
        */
    }
}
