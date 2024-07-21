package com.example.leetcode._351_to_400._398_RandomPickIndex;

import java.util.ArrayList;
import java.util.Random;

public class Solution398v1 implements Solution398
{
  private int[] nums = null;
  
  public Solution398v1(int[] nums) 
  {
    this.nums = nums;
  }
  
  public int pick(int target) 
  {
    ArrayList<Integer> idxs = new ArrayList<Integer>();
    for (int i=0; i<this.nums.length; i++) {
      if (this.nums[i] == target) idxs.add(i);
    }
    
    Random rand = new Random();
    return idxs.get(rand.nextInt(idxs.size()));  
  }
}
/**
* Your Solution object will be instantiated and called as such:
* Solution obj = new Solution(nums);
* int param_1 = obj.pick(target);
*/
