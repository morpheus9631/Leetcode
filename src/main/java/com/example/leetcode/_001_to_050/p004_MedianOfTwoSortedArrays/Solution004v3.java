package com.example.leetcode._001_to_050.p004_MedianOfTwoSortedArrays;


public class Solution004v3 implements Solution004
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double median = 0.0; 
        
        if ((nums1 == null) || (nums2 == null)) return 0;

        int alen = nums1.length;
        int blen = nums2.length;
        int sumlen = alen + blen;

    	// 如果兩個有序數列的長度和為 0, 表示沒有任何元素, 傳回 0
        if (sumlen == 0) return 0;

    	// 如果其中一個序列長度為 0，直接回傳另一個序列的中位數
        int mid = (sumlen / 2) + 1;
		boolean isSingleMedian = ((sumlen % 2) == 1);
		
		if (alen == 0)
			median = isSingleMedian ? nums2[mid-1] : (nums2[mid-1]+nums2[mid-1-1])/2.0;
		else if (blen ==0)
			median = isSingleMedian ? nums1[mid-1] : (nums1[mid-1]+nums1[mid-1-1])/2.0;
		else 
		{
			if (isSingleMedian) 
				median = findKthValue(nums1, nums2, mid);
			else 
				median 	= (findKthValue(nums1, nums2, mid)
						+  findKthValue(nums1, nums2, mid-1)) / 2.0;
		}
		return median;
    }
    
    public double findKthValue(int[] nums1, int[] nums2, int k)
    {
		double val = 0.0;

		int alen = nums1.length;
		int blen = nums2.length;

		int i = 0;
		int ia = 0, ib = 0;

		while (i++ < k) {
			if ((ia == alen) || (ib == blen)) {
				val = (ia == alen) ? nums2[k-alen-1] : nums1[k-blen-1];
				break;
			}

			if (nums1[ia] <= nums2[ib]) {
				val = nums1[ia];
				ia++;
			} else {
				val = nums2[ib];
				ib++;
			}
		}

		return val;
    }
}
