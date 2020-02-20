package com.example;

public class strStr_28 {
    public static void main(String[] args){

        System.out.println(strStr("hello", "ll"));
    }
    //method 1: use the indexOf()
    public int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }


        //method 2: brute force, but exceed time
    static public int strStr(String haystack, String needle) {

        if(needle.equals("") ) return 0;
        if (haystack.equals("") || haystack.length() < needle.length()) return -1;
        for(int i =0;i<haystack.length();i++)
        {
            for(int j = i+1;j<haystack.length()+1;j++)
            {
                //用==比较字符串容易bug
                //System.out.println(haystack.substring(i,j)==needle);
                if(haystack.substring(i,j).equals(needle)) {
                    return i;
                }
            }

        }
        return -1;
    }
}
