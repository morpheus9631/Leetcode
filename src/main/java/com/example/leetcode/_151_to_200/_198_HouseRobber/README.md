## 198\. House Robber

    You are a professional robber planning to rob houses along a street. 
    
    Each house has a certain amount of money stashed, 
    
    the only constraint stopping you from robbing each of them is that 
    
    adjacent houses have security system connected and it will automatically contact the police 
    
    if two adjacent houses were broken into on the same night.
    
    Given a list of non-negative integers representing the amount of money of each house, 
    
    determine the maximum amount of money you can rob tonight without alerting the police.
    
----------------------------------------------------------------------------------------------------    
    
    題目大意
    
    　　題目大意：你是一名專業強盜，計劃沿著一條街打家劫舍。
    
      每間房屋都儲存有一定數量的金錢，唯一能阻止你打劫的約束條件就是：
      
      由於房屋之間有安全系統相連，如果同一個晚上有兩間相鄰的房屋被闖入，
      
      它們就會自動聯絡警察，因此不可以打劫相鄰的房屋。 
    
    解題思路
    
    　　給定一列非負整數，代表每間房屋的金錢數，計算出在不驚動警察的前提下一晚上最多可以打劫到的金錢數。 
    　　
      解題思路：動態規劃（Dynamic Programming） 
    　　
      狀態轉移方程：dp[i] = max(dp[i-2], dp[i-3]) + num[i]
    　　
      其中，dp[i] 表示打劫到第 i 間房屋時累計取得的金錢最大值。 
    　　
      第 i 個位置的 max 值是由 max(i-2, i-3) 加上 i 位置的值決定，以此類推    