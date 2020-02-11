package com.example;

import java.util.HashMap;

public class longest_substring_wo_repeating_char_3 {
    public static void main(String[] args) {


        System.out.println("Reversed Number: " + lengthOfLongestSubstring("abba"));
    }
    static public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()<0)
            return 0;
        else
        {
            HashMap<Character, Integer> char2Index = new HashMap<Character, Integer>();
            int max = 0;
            int pre = -1;
            for(int i =0; i<s.length();i++)
            {
                char currentChar = s.charAt(i);
                Integer index = char2Index.get(currentChar);
                //make sure the abba, the pre used to calculated will not
                //be the position of b
                if(index!=null)
                    pre = Math.max(pre, index);
                max = Math.max(max, i - pre);
                char2Index.put(currentChar, i);
            }
            return max;

        }

    }

}
