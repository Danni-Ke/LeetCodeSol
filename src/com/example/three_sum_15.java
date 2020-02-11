package com.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3) return result;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            //如果在选择第一个加数的时候有重复，就跳过，在一直往下loop的过程中
            //已经避免了重复的可能，每一个num[i] 被测试之后，都会有和后面的不一样的组合。
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //类似bruteforce所有可能组合， 然后用left right来缩近所有可能选择
            //如果太大或者太小就向左向右移动
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] < 0) left++;
                else if (nums[left] + nums[right] + nums[i] > 0) right--;
                else {
                    result.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                    //注意要去除重复的，如果有重复的就一直缩进
                    //delete the repeated elements
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
