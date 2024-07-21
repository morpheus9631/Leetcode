package com.example.leetcode._351_to_400._381_InsertDeleteGetRandomBigO1_DuplicatesAllowed;

import com.example.leetcode.utils.myStringUtils;

public class Main381
{
  public static void main(String[] args)
  {
    System.out.println("381. Insert Delete GetRandom O(1) - Duplicates allowed");
    
    String format1 = "\r\nCollections.%s(%d)";
    String format2 = "\r\nCollections.%s(): %d";
    
    RandomizedCollection collection = new RandomizedCollection();

    int testcase_len = _Orders.length;
    for (int i=0; i<testcase_len; i++)
    {
      String[] orders = _Orders[i];
      int[] vals = _Vals[i];

      int order_len = orders.length; 
      for (int j=0; j<order_len; j++)
      {
        String order = orders[j];
        int val = vals[j];

        if (order == "insert") 
        {
          collection.insert(val);
          System.out.println(String.format(format1, order, val));
        }
        else if (orders[j] == "remove") 
        {
          collection.remove(val);
          System.out.println(String.format(format1, order, val));
        }
        else if (orders[j] == "getRandom")
        {
          val = collection.getRandom();
          System.out.println(String.format(format2, order, val));
        }
      }
      System.out.println("\r\n\r\n"+myStringUtils.dashLine());
    }
  }
  
  private static String[][] _Orders = 
  {
      {"insert","insert","insert","getRandom","remove","getRandom"}
      
      // Expected: Expected: [true, false, true, 2, true, false, 2]
    , {"insert","remove","insert","getRandom","remove","insert","getRandom"}
  };
  
  private static int[][] _Vals = 
  {
      { 1, 1, 2, 0, 1, 0 }
    , { 1, 2, 2, 0, 1, 2, 0 } 
  };
}
