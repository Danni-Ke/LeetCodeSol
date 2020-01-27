package com.example;

public class longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        //compare 1&2, (12)&3, (123)&4.......
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i =1; i<strs.length; i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
