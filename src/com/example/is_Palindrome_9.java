package com.example;

public class is_Palindrome_9 {
    //method that not using string
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reverse = 0;
        if(x<0)
            return false;
            //x>=0 same case, no need to divide
        else{
            while(x!=0)
            {
                reverse = reverse*10 + x%10;
                x /= 10;
            }
            return originalNum== reverse;
        }
    }
    //method that using string
    public boolean isPalindrome1(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }

}
