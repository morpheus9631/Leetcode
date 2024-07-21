package com.example.leetcode._151_to_200._169_MajorityElement;

/*
 * 用二分搜尋法：
 * 
 *   如果存在 major，major 必定會出現在中間位置。
 *   
 *   所以，以中間位置的數字向左、右半段以二分搜尋法找出起始點和終點，就可以算出中間位置數字的長度
 *   
 *   如果長度大於總長度的 1/2，即為 major，反之則不是。
 */

import java.util.Arrays;

public class Solution169v4  implements Solution169
{
  public int majorityElement(int[] nums) 
  {
    int major = Integer.MIN_VALUE;
    
    if (nums == null) throw new IllegalArgumentException("Illegal array");
    
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];

    if (nums.length == 2) { 
      return (nums[0] == nums[1]) ? nums[0] : Integer.MIN_VALUE;
    }
    
    Arrays.sort(nums);
    
    int mid = nums.length / 2;
    
    int start = binSearchLeft(nums, 0, mid, nums[mid]);
    int end = binSearchRight(nums, mid+1, nums.length-1, nums[mid]);
    
    int len = end - start + 1;
    if (len > mid) major = nums[mid];
    
    return major;
  }
  
  private int binSearchLeft(int[] nums, int start, int end, int target)
  {
    if (start > end) return start;
    
    int mid = (start + end) / 2;
    if (nums[mid] >= target) 
      end = mid - 1;
    else if (nums[mid] < target)
      start = mid + 1;
    
    return binSearchLeft(nums, start, end, target);
  }
  
  private int binSearchRight(int[] nums, int start, int end, int target)
  {
    if (start > end) return end;
    
    int mid = (start + end) / 2;
    if (nums[mid] > target) 
      end = mid - 1;
    else if (nums[mid] <= target)
      start = mid + 1;
    
    return binSearchRight(nums, start, end, target);
  }
  
}
