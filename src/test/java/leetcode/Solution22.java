package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution22 {

    public static void main(String[] args) {
        System.out.println(intersect2(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    //this solution works only we dont need to return repeated numbers as many times and they intersect
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet set1 = new HashSet();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        HashSet intersection  = new HashSet();

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (Object value : intersection) {
            result[i++] = (Integer) value;
        }
        return result;
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> result = new ArrayList<>();

        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        int[] res = new int[result.size()];

        for(int x=0;x< result.size(); x++){
            res[x] = result.get(x);
        }
        return res;
    }
}
