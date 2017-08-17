import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in
 * the array, and it should return false if every element is distinct.
 */

public class Main {

    public static void main(String[] args) {
        int[] nums = {10,3,2,3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean numMatch = false;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                numMatch = true;
                return numMatch;
            }
        }

        return numMatch;
    }
}
