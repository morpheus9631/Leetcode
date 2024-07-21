package com.example.leetcode._201_to_250._207_CourseSchedule;

import java.util.LinkedList;

public class Solution207v1 implements Solution207
{
	public boolean canFinish(int numCourses, int[][] prerequisites) 
	{
    if (prerequisites == null) {
		  throw new IllegalArgumentException("illegal prerequisites array");
    }
		
		int len = prerequisites.length;
		if ((numCourses == 0) || (len == 0)) return true;

	  // counter for number of prerequisites
    int[] preCounter = new int[numCourses];
    for (int i=0; i<len; i++) {
    	preCounter[prerequisites[i][0]]++;
    }
 
    //store courses that have no prerequisites
    LinkedList<Integer> noPreList = new LinkedList<Integer>();
    for (int i=0; i<numCourses; i++) {
      if (preCounter[i] == 0) noPreList.add(i);
    }
 
    // number of courses that have no prerequisites
    int numNoPre = noPreList.size();
 
    while(!noPreList.isEmpty())
    {
      int top = noPreList.remove();
      
      for(int i=0; i<len; i++)
      {
        // if a course's prerequisite can be satisfied by a course in queue
        if(prerequisites[i][1] == top) 
        {
          preCounter[prerequisites[i][0]]--;
          if (preCounter[prerequisites[i][0]] == 0) 
          {
            numNoPre++;
            noPreList.add(prerequisites[i][0]);
          }
        }
      }
	  } 
    
    return numNoPre == numCourses;
	}  
}
