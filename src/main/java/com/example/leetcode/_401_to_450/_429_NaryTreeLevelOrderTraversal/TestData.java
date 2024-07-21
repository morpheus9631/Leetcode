package com.example.leetcode._401_to_450._429_NaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestData 
{
  public static final int[][][] TrainData = {
    { {1}, {3,2,4} },
    { {3}, {5,6} }
  };
  
  public static List<List<Integer>> getTrainResult()
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    result.add(Arrays.asList(1));    
    result.add(Arrays.asList(3,2,4));    
    result.add(Arrays.asList(5,6));    
   
    return result;
  }
  
      
}


