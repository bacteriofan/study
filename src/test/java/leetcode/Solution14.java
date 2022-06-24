package leetcode;

import java.util.Arrays;

public class Solution14 {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {2,2,1}));

    }

    public static int singleNumber(int[] nums) {
        int unique = nums[0];
        for (int i = 1; i < nums.length; i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }

    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i = i+2) {
            if (nums[i] != nums[i-1]) {
                return nums[i-1];
            }
       }
        return nums[nums.length-1];
    }
}
