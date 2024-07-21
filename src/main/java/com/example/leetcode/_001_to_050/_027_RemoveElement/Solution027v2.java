package com.example.leetcode._001_to_050._027_RemoveElement;

public class Solution027v2 implements Solution027
{
  public int removeElement(int[] nums, int val) 
  {
  	if (nums == null) return -1;
  	
  	int len = nums.length;
  	if (nums.length == 0) return 0;
  	
  	int j = len-1;
  	
  	int i = 0;
  	while (i < j)
  	{
  		while (j >= 0 && nums[j] == val) j--;
  		if (j <= i) break;
 		  // System.out.println("B: "+i+", "+j+", "+nums[j]);

  		while (i < len && nums[i] != val) i++;
  		if (i >= j) break;
  		// System.out.println("C: "+i+", "+j+", "+nums[i]);
  		
  		nums[i] = nums[j]; nums[j] = val;
  		i++;
  	}
  	if (i < len && nums[i] != val) i++;
  			
  	return i;
  }
}


