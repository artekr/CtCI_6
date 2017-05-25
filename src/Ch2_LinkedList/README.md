### Chapter 2 Linked List

A linked list is a data structure that represents a sequence of nodes.

Unlike an array, a linked list does not provide constant time access to a particular "index" within the list. 
This means that if you'd like to  nd the Kth element in the list, you will need to iterate through K elements.

The benefit of a linked list is that you can add and remove items from the **beginning** of the list in constant time.

#### The *"Runner"* Technique

The "runner" (or second pointer) technique is used in many linked list problems. The runner technique means that you 
iterate through the linked list with two pointers simultaneously, with one ahead of the other. The "fast" node might be 
ahead by a fixed amount, or it might be hopping multiple nodes for each one node that the "slow" node iterates through.

You could have one pointer *p1* (the fast pointer) move every two elements for every one move that *p2* makes. 
When *p1* hits the end of the linked list, *p2* will be at the midpoint. Then, move *p1* back to the front and begin 
"weaving" the elements. On each iteration, *p2* selects an element and inserts it a er *p1*.


#### Recursive Problems
Recursive algorithms take at least *O(n)* space, where n is the depth of the recursive call. All recursive algorithms 
can be implemented iteratively, although they may be much more complex.
