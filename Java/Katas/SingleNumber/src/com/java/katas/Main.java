package com.java.katas;

import java.util.Arrays;

/**
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 *
 */

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,2,1,-4,0,0};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumer2(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int n:nums){
            result ^= n;
        }

        return result;
    }

    // not working when input is large, why?
    public static int singleNumer2(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        if(nums.length==1)
            n = nums[0];
        else{
            for(int i=0;i<nums.length-2;i+=2){
                if(nums[i]==nums[i+1])
                    continue;
                else{
                    n = nums[i];
                    break;
                }
            }
        }

        return n;
    }
}
