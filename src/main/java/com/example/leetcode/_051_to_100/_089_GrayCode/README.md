## 89\. Gray Code

    The gray code is a binary numeral system where two successive values differ in only one bit.
    
    Given a non-negative integer n representing the total number of bits in the code,
    
    print the sequence of gray code. A gray code sequence must begin with 0.
    
    For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
    
        00 - 0
        01 - 1
        11 - 3
        10 - 2
    
    Note:
        
        For a given n, a gray code sequence is not uniquely defined.
        
        For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
        
        For now, the judge is able to judge based on one instance of gray code sequence. 
        
        Sorry about that.
    -------------------------------------------------------------------------------------------------
    
    Solution 1:
    
      由於 Gray Code 相鄰兩數間只改變一個位元，所以可觀察 Gray Code 從 1 變 0 或從 0 變 1 時的位置。
      
      假設有4位元的Gray Code如下：
    
        0000 0001 0011 0010 0110 0111 0101 0100
        1100 1101 1111 1110 1010 1011 1001 1000
      
      觀察奇數項的下個數變化時，發現只改變最右邊的位元，如果是 1 就改為 0，如果是 0 就改為 1。
      
      例如第一項 0000 變為 0001，第三項 0011 變為 0010，第五項 0110 變為  0111，依此類推。
      
      觀察偶數項的下個數變化時，發現所改變的位元，是由右邊算來首個1的左邊位元。
      
      例如第二項 0001 下個數變為 0011，第四項 0010 下個變為 0110，第六項 0111 變為 0101，依此類推。
    -------------------------------------------------------------------------------------------------
    
    Solution 2:
    
      格雷碼，學過通信原理的同學應該都不陌生，只不過格雷碼的生成方法不是按照題目中描述的那樣。
    
      教科書中的格雷碼生成方法如下：
      
        n=1 得到 0 1
        
        n=2 得到 00 01 11 10（注意，11 和 10除了符號位外，和 00 01對稱的）
        
        n=3 得到 000 001 011 010 110 111 101 100（後面四位除了符號位之外，和前四位對稱）
        
        n=4 依次類推 
