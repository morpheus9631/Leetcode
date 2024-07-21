package com.example.leetcode._001_to_050.p001_TwoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution03 implements Solution001
{
        
    public int[] twoSum(int[] nums, int target)
    {
        if (nums == null) return null;
        if (nums.length < 2) return null;
        
        int[] idxs = new int[2];
        
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        
        int len = nums.length;
        for (int i=0; i<len; i++) 
        {
            int num = nums[i];
            List<Integer> list  = (map.containsKey(num))
                                ? map.get(num) 
                                : new ArrayList<Integer>();
            list.add(i);
            map.put(num, list);
        }
        
        for (int num : nums)
        {
            idxs[0] = map.get(num).get(0);
            int val = target - num;

            if (map.containsKey(val)) 
            {
                if ((num == val) && map.get(val).size() > 1)
                {    
                    idxs[1] = map.get(val).get(1);
                    break;
                }
                else if (num != val)
                {
                    idxs[1] = map.get(val).get(0);
                    break;
                }
            } 
        }
        return idxs;
    }
}
