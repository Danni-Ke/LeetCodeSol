package com.example;

import java.util.HashMap;
import java.util.Stack;

public class remove_Element_27 {
    public int removeElement(int[] nums, int val) {
        int j =0;
        for(int i =0; i< nums.length;i++)
        {

            if(nums[i]!= val)
            {
                nums[j++] = nums[i];

            }
        }
        return j;
    }
}
