package com.example.leetcode._151_to_200._165_CompareVersionNumbers;

public class Solution165v1 implements Solution165
{
  public int compareVersion(String version1, String version2) 
  {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");

    int res = 0;
    int i = 0, j = 0;
    while (i < v1.length && j < v2.length)
    {
      int n1 = Integer.valueOf(v1[i]);
      int n2 = Integer.valueOf(v2[j]);
      
      if (n1 > n2)
      {
        return 1;
      }
      else if (n1 < n2)
      {
        return -1;
      }
      else if (n1 == n2){
        i++;
        j++;
      }
    }
    
    if (i < v1.length && j == v2.length) {
      while (i < v1.length) {
        if (Integer.valueOf(v1[i++]) > 0) return 1;
      }
    }
    
    if (i == v1.length && j < v2.length) {
      while (j < v2.length) {
        if (Integer.valueOf(v2[j++]) > 0) return -1;
      }
    }
      
    return res;
  }
}
