package com.java.katas;

/**
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example:
 * Given s = "hello", return "olleh".
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseStringSB("hello"));
        System.out.println(reverseStringSwap("hello"));
    }

    // reverse using String Builder reverse function
    public static String reverseStringSB(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString();
    }

    // swap start and end chars
    public static String reverseStringSwap(String s) {
        char[] newS = s.toCharArray();
        int begin = 0;
        int end = newS.length-1;
        while(begin <= end) {
            char temp = newS[begin];
            newS[begin] = newS[end];
            newS[end] = temp;
            begin++;
            end--;
        }

        return new String(newS);
    }
}
