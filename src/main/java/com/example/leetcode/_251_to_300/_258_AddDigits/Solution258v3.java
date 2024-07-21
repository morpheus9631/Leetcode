package com.example.leetcode._251_to_300._258_AddDigits;

/*
 * Your runtime beats 24.54% of java submissions.
 */

/*
    解題：
    
      假設有一數字為 ABCDE，則：
      
        ABCDE = A*10000 + B*1000 + C*100 + D*10 + E
            = (A*9999 + B*999 + C*99 + D*9) + (A+B+C+D+E)
          
      故 ABCDE % 9 = (A+B+C+D+E) % 9，其結果必定為一位數
      
      但由於當 (A+B+C+D+E) = 0~8 時，(A+B+C+D+E)%9 也會出現 0~8 的結果，
      
      而當 (A+B+C+D+E) = 9 時則會出現 (A+B+C+D+E)%9 = 0。
      
      與題意的 (A+B+C+D+E) = 0~9 會出現 (A+B+C+D+E)%10 = 0~9 不符。
      
      所以需要做轉換，轉換式如下：
      
        ABCDE % 9 = (A+B+C+D+E-1)%9 + 1
        
      這樣一來，就可以得到 (A+B+C+D+E)%10 = 0~9 的結果
 */
public class Solution258v3 implements Solution258
{
  public int addDigits(int num) 
  {
    return ((num - 1) % 9) + 1;
  }
}
