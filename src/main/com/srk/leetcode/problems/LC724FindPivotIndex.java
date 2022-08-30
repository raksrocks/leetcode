package com.srk.leetcode.problems;

import java.util.Arrays;

public class LC724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        //int index=-1;
        for(int i=0; i<nums.length; i++){
            if(sumOf(Arrays.copyOfRange(nums,0,i))==sumOf(Arrays.copyOfRange(nums,i+1,nums.length)))
                return i;
        }
        return -1;
    }
    public int sumOf(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new LC724FindPivotIndex().pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}

