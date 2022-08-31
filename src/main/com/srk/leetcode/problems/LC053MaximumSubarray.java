package com.srk.leetcode.problems;

public class LC053MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(new LC053MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public int maxSubArray(int[] nums) {
        int result=0;
        if(nums.length==1)
            return nums[0];
        for(int i=0; i<nums.length; i++){
            if(result==0 && nums[i]<0)
                continue;
            result+=nums[i];
        }

        return result;
    }
    public int sumOf(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];

        return sum;
    }
}
