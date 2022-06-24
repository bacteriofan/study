package leetcode;

public class Solution18 {


    public static void main(String[] args) {
        moveZeroes(new int[] {0,1});
    }


    public static void moveZeroes(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        for (int i = nums.length-1; i >= counter; i--) {
            nums[i] = 0;
        }
    }

//    public static void moveZeroes2(int[] nums) {
//        int counter =-1;
//        int i=0;
//        while(i<nums.length){
//            if(nums[i]!=0){
//                counter++;
//                nums[counter]=nums[i];
//            }
//            i++;
//        }
//        while(counter<(nums.length-1)){
//            counter++;
//            nums[counter]=0;
//        }
//    }
}
