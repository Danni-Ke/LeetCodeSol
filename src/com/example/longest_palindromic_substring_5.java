package com.example;

import javax.swing.*;


public class longest_palindromic_substring_5 {

    public static void main(String[] args)
    {
        System.out.println("Longest Substring is: "+longestPalindrome6("aba"));

    }
    //METHOD 1. 中心扩展法，遍历每一个字母然后以其为中心寻找最长回文  O(n^2)
    static public String longestPalindrome6(String s){
        if(s.length()<=1)
            return s;
        int left = 0;
        int right = 0;
        for(int i =0; i< s.length();i++)
        {
            //分别寻找奇数和偶数长度的回文，以每个字母为中心
            int lens1 = findLongestPalindrome(s,i,i);
            int lens2 = findLongestPalindrome(s,i,i+1);
            int len = Math.max(lens1, lens2);
            if(len > right - left +1)
            {
                left = i -(len -1)/2;
                right = i+ len/2;
            }

        }
        return s.substring(left,right+1);
    }
    //helper function
    static public int findLongestPalindrome(String s, int center1, int center2) {
        int left = center1;
        int right = center2;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left -1;
    }
    //METHOD 2. brute force way, exceed time limit， O(n^3)
    static public String longestPalindrome(String s) {
        if(s == null)
            return " ";
        if(s.length() <=1 )
            return s;
        //space is counted as a length 1 string
        String longestStr = "";
        String curSubstr = "";
        int max = 0;
        //get all the substring, substring get the string before the end position
        for(int i = 0;i< s.length();i++) {
            for(int j = i+1; j<s.length()+1; j++){

                curSubstr = s.substring(i,j);

                if(isPalindromic(curSubstr)&& longestStr.length()< curSubstr.length())
                {
                    longestStr = curSubstr;
                    max = Math.max(max, longestStr.length());
                }
            }
        }
        return longestStr;
    }
    //helper function
    static public boolean isPalindromic(String s)
    {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    //Method 3. manachar algorithm, O(n

}
