package com.example.leetcode._001_to_050.p004_MedianOfTwoSortedArrays;


public class Solution004v1 implements Solution004
{
        
    public double findMedianSortedArrays(int A[], int B[]) 
    {    
        int m = A.length, n = B.length;
        
        if ((n + m) % 2 == 1)
            return findKthSortedArrays(A, 0, m, B, 0, n, (n + m) / 2 + 1);
        else    
            return (findKthSortedArrays(A, 0, m, B, 0, n, (n + m) / 2 + 1) +
                    findKthSortedArrays(A, 0, m, B, 0, n, (n + m) / 2)) / 2.0;
    }
    
    private double findKthSortedArrays(
        int A[], int astart, int aend, int B[], int bstart, int bend, int k) 
    {
        int m = aend - astart, n = bend - bstart;
        
        if (m < n) {    
            return findKthSortedArrays(B, bstart, bend, A, astart, aend, k);
        }    
        
        if (n == 0) return A[astart + k - 1];
        
        if (k == 1) return Math.min(A[astart], B[bstart]);

        int pb = Math.min(k / 2, n), pa = k - pb;
        
        if (A[astart + pa - 1] > B[bstart + pb - 1])
            return findKthSortedArrays(A, astart, aend, B, bstart + pb, bend, k - pb);
        else if (A[astart + pa - 1] < B[bstart + pb - 1])
            return findKthSortedArrays(A, astart + pa, aend, B, bstart, bend, k - pa);
        else
            return A[astart + pa - 1];
    }    
}
