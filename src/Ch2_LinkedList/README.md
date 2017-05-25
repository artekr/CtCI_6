### Chapter 2 Linked List

A linked list is a data structure that represents a sequence of nodes.

The benefit of a linked list is that you can add and remove items from the **beginning** of the list in constant time.

#### ListNode implementation

```java
public class ListNode {
  /**
   * ListNode implementation
   */
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
