## 155\. Min Stack

    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    
      push(x) -- Push element x onto stack.
      pop() -- Removes the element on top of the stack.
      top() -- Get the top element.
      getMin() -- Retrieve the minimum element in the stack.
      
    Example:
      MinStack minStack = new MinStack();
      minStack.push(-2);
      minStack.push(0);
      minStack.push(-3);
      minStack.getMin();   --> Returns -3.
      minStack.pop();
      minStack.top();      --> Returns 0.
      minStack.getMin();   --> Returns -2.
      
------------------------------------------------------------------------------------------

    解題：
    
      此題的困難點在於要隨時以最小的時間複雜度紀錄 stack 中的最小值 (MIN_VAL)。
      
      1.為了要記憶 MIN_VAL，所以在 push(x) 時就要將曾當過 MIN_VAL 儲存於 minStack。
      
      2.若以一個變數儲存 MIN_VAL 時，當 MIN_VAL 被 pop 後，需要 O(n) 才能找出新的 MIN_VAL，
      
      　因為執行效益低，會造成 Time Limit Exceeded，所以不採用。
      
      3.故採用 stack 儲存在 push 過程中碰到的 "曾經當過" MIN_VAL 的方法。
      
      4.由於在 pop 過程中 MIN_VAL 可能會被取出，此時，也要同時將 MIN_VAL 從 minStack 中移出，
      
      　才能維持 minStack 僅儲存 MIN_VAL 的功用。
      
      　同時，由於 minStack 僅儲存部分當過 MIN_VAL 的數值，
      
      　所以 minStack 的元素個數小於 stack 的情形常發生，所以有可能 minStack 變成空集合。
      
      　此時，要重先補充 minStack 的元素。
      
      5.由於僅有 pop 時會改變 MIN_VAL，所以可以簡化 getMin 的程序，僅需回傳 minStack.peek() 即可。
      