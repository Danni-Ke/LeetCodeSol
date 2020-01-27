package com.example;

import java.util.HashMap;

public class two_Sum_1 {
   /*
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = -1;
        nums[1] = 4;
        nums[2] = 3;
        nums[3] = -2;
        int[] answer = new int[2];
        answer = twoSum(nums, -3);

    }*/


   //method 1 O(n^2)
    public int[] twoSum(int[] nums, int target) {
        System.out.println("here");
        int[] answer = new int[2];
        int count =0;
        for (int i = 0; i < nums.length; i++)
        {
            int newtarget = target - nums[i];
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] == newtarget && i != j& count<=0)
                {
                        count++;
                        answer[0] = i;
                        answer[1] = j;
                        System.out.println(i+","+j);
                }
            }
        }
        return answer;
    }
    //method 2 O(n)
    public int[] twoSum2(int[] nums, int target)
    {
        if(nums==null ||nums.length<2)
        {
            return new int[] {0,0};
        }

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i =0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[] {map.get(nums[i]), i};
            }
            else{
                map.put(target - nums[i], i);
            }
        }
        return new int []{0,0};
    }
}
