package leetcode;

import java.util.HashSet;

public class Solution13 {

    public static void main(String[] args) {
        System.out.println(containsDuplicate2(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i !=j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
