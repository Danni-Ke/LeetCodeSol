package com.example;

public class jump_Game_55 {

    public static void main(String [] args) {


        System.out.println(canJump(new int[]{1, 0, 1, 0}));
    }



    static public boolean canJump(int[] nums) {
        int distance=0;
        for(int i = 0;i<nums.length;i++)
        {
            //System.out.println(i+","+distance);
            //distance smaller than the location, not reacheable
            //update the maximum we can reach, keep check above
            if(distance<i||distance>=nums.length-1) break;
            distance = Math.max(distance, i + nums[i]);

        }
        return distance>=nums.length-1;
    }
}
