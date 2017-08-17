package com.java.katas;

/**
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 *
 */

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,2,1,-4,0,0};
        System.out.println(singleNumber(nums));
    }

    /**
     * Bitwise operator
     * XOR ^
     * Examples:
     * a^a = 0
     * 0^a = a
     *
     */
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int n:nums){
            result ^= n;
        }

        return result;
    }
}
