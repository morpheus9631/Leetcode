package com.example.leetcode._301_to_350._332_ReconstructItinerary;

import java.util.List;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myListUtils;
import com.example.leetcode.utils.myStringUtils;

public class Main332
{
  public static void main(String[] args)
  {
    System.out.println("332. Reconstruct Itinerary");
    
    String format = "\r\ntickets:"
                  + "\r\n%s" 
                  + "\r\n\r\nReturn:"
                  + "\r\n %s"
                  + "\r\n\r\n" + myStringUtils.dashLine()
                  ;
    
    Solution332 sol = new Solution332v1();
    
    for (String[][] tickets : _testCases)
    {
      List<String> res = sol.findItinerary(tickets);
      System.out.println(
          String.format(format, myArrayUtils.toString(tickets)
                              , myListUtils.toRowString(res)));
    }
  }

  private static String[][][] _testCases = 
  {
      // Expected: ["JFK", "MUC", "LHR", "SFO", "SJC"].
      { {"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"} }
    
      // Expected: ["JFK","ATL","JFK","SFO","ATL","SFO"]
    , { {"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"} }
    
    , { {"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"} }
    
    
      // Excepted: ["JFK","AXA","AUA","ADL","ANU","AUA","ANU","EZE","ADL","EZE",
      //            "ANU","JFK","AXA","EZE","TIA","AUA","AXA","TIA","ADL","EZE","HBA"]
    , {  
       {"EZE","TIA"},{"EZE","HBA"},{"AXA","TIA"},{"JFK","AXA"},{"ANU","JFK"},
       {"ADL","ANU"},{"TIA","AUA"},{"ANU","AUA"},{"ADL","EZE"},{"ADL","EZE"},
       {"EZE","ADL"},{"AXA","EZE"},{"AUA","AXA"},{"JFK","AXA"},{"AXA","AUA"},
       {"AUA","ADL"},{"ANU","EZE"},{"TIA","ADL"},{"EZE","ANU"},{"AUA","ANU"}
      }
      // Expected: ["JFK","MUC","LHR","SFO","SJC"]
    , {{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}}
  };
  
}
