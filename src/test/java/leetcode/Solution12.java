package leetcode;

public class Solution12 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(145));
    }

    public static boolean isPalindrome(int num){
        if(num < 0) return  false;

        int reversed = 0;
        int remainder;
        int original = num;

        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num = num/10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }
}
