package com.java.katas;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 *
 */

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,2,1,4};
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

    public static int singleNumer2(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        for(int i=0;i<nums.length-1;){
            if(nums[i] == nums[i+1]){
                i+=2;
            }
            else{
                n = nums[i];
                break;
            }
        }
        return n;
    }
}
