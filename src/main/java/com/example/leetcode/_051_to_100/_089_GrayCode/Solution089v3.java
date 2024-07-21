package com.example.leetcode._051_to_100._089_GrayCode;

import java.util.ArrayList;
import java.util.List;

/*
    格雷碼，學過通信原理的同學應該都不陌生，只不過格雷碼的生成方法不是按照題目中描述的那樣。
    
    教科書中的格雷碼生成方法如下：
    
    n=1 得到 0 1
    
    n=2 得到 00 01 11 10（注意，11 和 10除了符號位外，和 00 01對稱的）
    
    n=3 得到 000 001 011 010 110 111 101 100（後面四位除了符號位之外，和前四位對稱）
    
    n=4 依次類推 
*/

public class Solution089v3 implements Solution089
{
  public List<Integer> grayCode(int n) 
  {  
    List<Integer> res = new ArrayList<Integer>();  
    
    for (int i=0; i<(1<<n); i++) {
      res.add(i ^ (i >> 1));
    }  
    
    return res;  
  }  
}