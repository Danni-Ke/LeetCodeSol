package com.example;

import java.util.HashMap;

public class remove_Duplicates_26 {

    public static void main(String[] args){
        int nums[] = new int[3];
        nums[0]=1;
        nums[1]=1;
        nums[2]=2;
        System.out.println(removeDuplicates(nums));
    }
    //double ptr
    static public int removeDuplicates(int[] nums) {
        if(nums.length ==0) return 0;
        int i =0;
        for(int j = 0;j<nums.length;j++)
        {
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
