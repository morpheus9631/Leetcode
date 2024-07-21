## 409\. Longest Palindrome

    Given a string which consists of lowercase or uppercase letters, 
    
    find the length of the longest palindromes that can be built with those letters.
    
    This is case sensitive, for example "Aa" is not considered a palindrome here.
    
    Note:
    
      Assume the length of given string will not exceed 1,010.
    
    Example:
    
      Input: "abccccdd"
      Output: 7
    
    Explanation:
    
      One longest palindrome that can be built is "dccaccd", whose length is 7.
      
-------------------------------------------------------------------------------------------

    這道題並不是求字符串裡最長的回文串，而是說用這些字符可以構成多長的回文串。
    
    所謂的回文串，就是要左右對稱，所以除了中心的那個位置的字符可以出現奇數次以外，都要出現偶數次。
    
    如此，方式就很簡單了：
    
      1、統計所有字母的出現頻率（分大小寫）
        
      2、統計只出現奇數次數字母的個數
        
      3、如果 2 中的結果不為 0，則最長的回文串的長度為字串長度減去 2 中的字母個數 + 1
        
      其中3的意思是，保留出現次數最多的那個奇數字母，剩下的需要全部減1變成偶數去構造
      
    