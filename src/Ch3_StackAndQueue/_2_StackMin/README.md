
## 3.2 Stack Min

How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? 
Push, pop and min should all operate in 0(1) time.

**EXAMPLE:**

    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin();   --> Returns -3.
    minStack.pop();
    minStack.top();      --> Returns 0.
    minStack.getMin();   --> Returns -2.

---
LeetCode:
[155. Min Stack](https://leetcode.com/problems/min-stack)