package leetcode;

import java.util.Arrays;

public class Solution15 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int n = nums.length/2;
        int count = 1;
        int result = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > n) {
                result = nums[i];
            }
        }
        return result;
    }
}
