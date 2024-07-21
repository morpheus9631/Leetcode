package com.example.leetcode._001_to_050.p004_MedianOfTwoSortedArrays;


import java.util.ArrayList;
import java.util.List;

public class Solution004v4 implements Solution004
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
		double val = 0.0;

		if ((nums1 == null) || (nums2 == null)) return 0;

		int m = nums1.length;
		int n = nums2.length;
		int numElems = m + n;

    	// 如果兩個有序數列的長度和為 0, 表示沒有任何元素, 傳回    0
		if (numElems == 0) return 0;

    	// 將元素數量較多的序列移到第一個
		if (m < n) return findMedianSortedArrays(nums2, nums1);

    	// 如果兩個有序數列的元素個數和為 1, 直接回傳第一個數列的第一個值
		if (numElems == 1) return nums1[0];
		
		/* 
    	 * 如果兩個有序數列的長度和為 2, 有兩種情形：
    	 * 1. 2個元素在第一個數列
    	 * 2. 兩個數列各 1個元素
    	 */
		if (numElems == 2) {
			return (n == 0) ? ((nums1[0] + nums1[1]) / 2.0)
							: ((nums1[0] + nums2[0]) / 2.0);
		}

		int mid = numElems / 2 + 1;
		boolean isTwoMid = ((numElems % 2) == 0) ? true : false;

		// 其中一個數列的元素個數為 0
		if (n == 0)	{
			val = nums1[mid-1];
			if (isTwoMid) {
				val += nums1[mid-1-1];
				val /= 2.0;
			}
			return val; 
		}

    	// 如果兩個數列的元素個數和 >= 3， 則依序查詢
		List<Integer> list = new ArrayList<Integer>();

		int ia = 0, ib = 0;
		do {
			if ((ia < m) && (nums1[ia] <= nums2[ib])) {	
				list.add(nums1[ia++]);
			}	

			if ((ia >= m) && (ib < n)) {
				while (ib < n) list.add(nums2[ib++]);
				break;
			}	

			if ((ib < n) && (nums2[ib] < nums1[ia])) {	
				list.add(nums2[ib++]);
			}	

			if ((ib >= n) && (ia < m)) {
				while (ia < m) list.add(nums1[ia++]);
				break;
			}

		} while (list.size() <= mid);

		val = list.get(mid-1);

        if (isTwoMid) {
			val += list.get(mid-1-1);
			val /= 2.0;
        }
        
		return val;
    }
}
