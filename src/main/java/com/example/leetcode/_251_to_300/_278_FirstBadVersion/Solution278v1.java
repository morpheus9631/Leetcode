package com.example.leetcode._251_to_300._278_FirstBadVersion;

/*
 * Your runtime beats 37.10% of java submissions.
 */

public class Solution278v1 extends VersionControl implements Solution278 
{
  public Solution278v1(int first_bad_version)
  {
    super(first_bad_version);
  }

  public int firstBadVersion(int n) 
  {
    int start = 1, end = n;  
    
    while (start < end) 
    {  
      int mid = start + (end - start) / 2;  
      if (isBadVersion(mid)) {  
        end = mid;  
      } else {
        start = mid + 1;  
      }  
    }  
    return start;    
  }
}
