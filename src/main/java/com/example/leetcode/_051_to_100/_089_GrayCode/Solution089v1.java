package com.example.leetcode._051_to_100._089_GrayCode;

import java.util.ArrayList;
import java.util.List;

/*
    由於 Gray Code 相鄰兩數間只改變一個位元，所以可觀察 Gray Code 從 1 變 0 或從 0 變 1 時的位置。

    假設有4位元的Gray Code如下：

      0000 0001 0011 0010 0110 0111 0101 0100
      1100 1101 1111 1110 1010 1011 1001 1000
  
    觀察奇數項的下個數變化時，發現只改變最右邊的位元，如果是 1 就改為 0，如果是 0 就改為 1。
    
    例如第一項 0000 變為 0001，第三項 0011 變為 0010，第五項 0110 變為  0111，依此類推。
    
    觀察偶數項的下個數變化時，發現所改變的位元，是由右邊算來首個1的左邊位元。
  
    例如第二項 0001 下個數變為 0011，第四項 0010 下個變為 0110，第六項 0111 變為 0101，依此類推。

*/

public class Solution089v1 implements Solution089
{
  public List<Integer> grayCode(int n) 
  {
    List<Integer> res = new ArrayList<Integer>();
    
    int code = 0;
    for (int i=0; i<Math.pow(2,n); i++)
    {
      if (i%2 == 1) {
        code = code ^ 0x01;
      }
      else
      {
        String binstr = Integer.toBinaryString(code);
        while (binstr.length() < n) binstr = "0" + binstr;
        
        int j = binstr.lastIndexOf('1') - 1;
        
        if (j >= 0)
        {
          int mask = 0x01 << (n-j-1);
          code ^= mask;
        }
      }
      res.add(code);
    }
    return res;
  }
}