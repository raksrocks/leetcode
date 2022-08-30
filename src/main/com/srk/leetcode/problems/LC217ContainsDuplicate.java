package com.srk.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;

public class LC217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet ss = new HashSet();
        for(int i:nums) ss.add(i);
        return !(ss.size()==nums.length);
    }
    public static void main(String[] args) {
        System.out.println(new LC217ContainsDuplicate().containsDuplicate(new int[]{1,7,3,6,5,6}));
    }
}
