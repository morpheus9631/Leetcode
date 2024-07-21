package com.example.leetcode._351_to_400._399_EvaluateDivision;

import com.example.leetcode.utils.myStringUtils;

public class Main399
{
  public static void main(String[] args)
  {
    System.out.println("399. Evaluate Division");
    
    String format = "\r\nGives: %s"
                  + "\r\nqueries are: %s"
                  + "\r\nReturn: %s"
                  + "\r\n\r\n" +myStringUtils.dashLine()
                  ;
    
    Solution399 sol = new Solution399v1();
    
    for (String[][][] testcase : _testCases)
    {
      String[][] equations = testcase[0];
      
      String[][] strVals = testcase[1];
      int len = strVals.length;
      double[] values = new double[len];
      for (int i=0; i<len; i++) 
        values[i] = Double.parseDouble(strVals[i][0]);

      String[][] queries = testcase[2];

      double[] res = sol.calcEquation(equations, values, queries);
      
      String str1 = toGivenString(equations, strVals);
      String str2 = toQueriesString(queries);
      String str3 = toReturnString(res);
      
      System.out.println(String.format(format, str1, str2, str3));
    }
  }
  
  private static String[][][][] _testCases = 
  {
     { // Expected: [ 6.0, 0.5, -1.0, 1.0, -1.0 ]
       { {"a", "b"}, {"b", "c"} },
       { {"2.0"}, {"3.0"} }, 
       { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} }
     },
     { //   Expected: [1.33333, 1.00000, -1.00000]
       { {"a", "e"}, {"b","e"} },
       { {"4.0"}, {"3.0"} },
       { {"a", "b"}, {"e", "e"}, {"x", "x"} }
     },
     { // Expected: [360.00000,0.00833,20.00000,1.00000,-1.00000,-1.00000]
       { {"x1","x2"}, {"x2","x3"}, {"x3","x4"}, {"x4","x5"} },
       { {"3.0"}, {"4.0"}, {"5.0"}, {"6.0"} },
       { {"x1","x5"}, {"x5","x2"}, {"x2","x4"}, {"x2","x2"} ,{"x2","x9"} ,{"x9","x9"} }
     },
     { // Expected: [-1.00000, -1.00000, 1.00000, 1.00000]
       { {"a", "b"}, {"c","d"} }, 
       { {"1.0"}, {"1.0"} },
       { {"a", "c"}, {"b", "d"}, {"b", "a"}, {"d", "c"} }
     }
  };
  
  private static String  toGivenString(String[][] equations, String[][] values)
  {
    StringBuilder sb = new StringBuilder();
    
    String format = "%s/%s = %s";

    for (int i=0; i<equations.length; i++)
    {
      sb.append(String.format(format, 
          equations[i][0], equations[i][1], values[i][0]))
         .append(", ");
    }
    int idx = sb.lastIndexOf(", ");
    sb.delete(idx, sb.length());
    
    sb.append(".");

    return sb.toString();
  }
  
  private static String  toQueriesString(String[][] queries)
  {
    StringBuilder sb = new StringBuilder();
    
    String format = "%s/%s = ?";
    for (int i=0; i<queries.length; i++)
    {
      sb.append(String.format(format, queries[i][0], queries[i][1]))
        .append(", ");
    }
    int idx = sb.lastIndexOf(", ");
    sb.delete(idx, sb.length());
    
    sb.append(".");

    return sb.toString();
  }

  private static String  toReturnString(double[] results)
  {
    StringBuilder sb = new StringBuilder();
    
    String format = "%3.1f";

    for (int i=0; i<results.length; i++)
      sb.append(String.format(format, results[i])).append(", ");
    
    int idx = sb.lastIndexOf(", ");
    sb.delete(idx, sb.length());
    
    sb.insert(0,  "[").append("]");

    return sb.toString();
  }
  
}
