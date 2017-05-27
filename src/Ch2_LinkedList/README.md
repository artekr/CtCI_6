
### Chapter 2 Linked List

A linked list is a data structure that represents a sequence of nodes.

The benefit of a linked list is that you can add and remove items from the **beginning** of the list in constant time.

#### ListNode implementation

```java
/**
 * ListNode implementation
 */
public class ListNode {
  
  public ListNode next = null;
  public int data;
  
  public ListNode(int d) {
    this.data = d;
  }
}
```

#### The *"Runner"* Technique
The "runner" (or second pointer) technique is used in many linked list problems. The runner technique means that you 
iterate through the linked list with two pointers simultaneously, with one ahead of the other. The "fast" node might be 
ahead by a fixed amount, or it might be hopping multiple nodes for each one node that the "slow" node iterates through.


#### Recursive Problems
Recursive algorithms take at least *O(n)* space, where *n* is the depth of the recursive call.


---

| Questions             | LeetCode                               |
| --------------------- | -------------------------------------- |
| 1. Remove Duplicates  | [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) <br> [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii) | 
| 2. Return Kth to Last | [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list) |
| 3. Delete Middle Node | [237. Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list) |
| 4. Partition    ★★★ | [86. Partition List](https://leetcode.com/problems/partition-list) |
| 5. Sum Lists          | |
| 6. Palindrome         | |
| 7. Intersection       | |
| 8. Loop Detection     | |

