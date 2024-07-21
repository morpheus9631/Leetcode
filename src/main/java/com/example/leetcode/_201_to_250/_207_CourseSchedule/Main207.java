package com.example.leetcode._201_to_250._207_CourseSchedule;

import com.example.leetcode.utils.myArrayUtils;
import com.example.leetcode.utils.myStringUtils;

/*
 * Test case:
 * 
 * 2, [0, 1]
 * 
 * 2, [[0, 1], [1, 0]]
 * 
 * 8, [[1,0],[2,6],[1,7],[5,1],[6,4],[7,0],[0,5],[5,1],[6,4]]
 * 
 */

public class Main207
{

	public static void main(String[] args)
	{
	  System.out.println("207. Course Schedule");
	  
	  String formay = "\r\nCourses: %d"
	                + "\r\nPrerequisites:\r\n%s"
	                + "\r\nIs it finish all courses? %b"
	                + "\r\n\r\n" + myStringUtils.dashLine();
	                ;
		
		Solution207 s = new Solution207v1();
		
		for (int[][][] testcase : _testCases)
		{
		  int numCourses = testcase[0][0][0];
		  int[][] prerequisites = testcase[1];
	    boolean result = s.canFinish(numCourses, prerequisites);
	    
	    String outstr = myArrayUtils.toString(prerequisites);
	    System.out.println(
	        String.format(formay, numCourses, outstr, result));
		}
	}

	private static int[][][][] _testCases = 
	{
	    { {{2}}, {{0,1}} }
	  , { {{2}}, {{0,1}, {1,0}} }
	  , { {{8}}, {{1,0}, {2,6}, {1,7}, {5,1}, {6,4}, {7,0}, {0,5}, {5,1}, {6,4}} }
	};
}
