package com.example.leetcode._151_to_200._189_RotateArray;

/*
 * 2016.10.05: Your runtime beats 97.69% of java submissions.
 */

public class Solution189v2 implements Solution189
{
  public void rotate(int[] nums, int k) 
  {  
    if (nums == null) return;  

    int n = nums.length;  
    if (n <= 1) return;  

    k = k % n;  
    int m = n - k;  
      
    int[] tmp = new int[k];  
    System.arraycopy(nums, m, tmp, 0, k);  
    System.arraycopy(nums, 0, nums, k , m);  
    System.arraycopy(tmp, 0, nums, 0, k);
  }  
}
