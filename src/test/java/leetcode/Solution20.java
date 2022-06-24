package leetcode;

import java.util.HashMap;

public class Solution20 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar2("aabb"));
    }


    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();


        for (int i = 0; i < arr.length - 1; i++) {
          boolean flag = false;
          for (int j = 1; j < arr.length - 1; j++) {
              if (arr[i] == arr[j] && i!=j) {
                  flag = true;
                  break;
              }
          }
          if (!flag) {
              return i;
          }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < arr.length; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
