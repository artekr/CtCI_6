package Ch2_LinkedList._3_DeleteMiddleNode;

import Ch2_LinkedList.ListNode;

/**
 * Created by hengwang on 2017-05-25.
 *
 * Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node,
 * not necessarily the exact middle) of a singly linked list, given only access to that node.
 *
 * EXAMPLE
 *
 * Input: the node c from the linked list: a->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like: a->b->d->e->f
 *
 * LeetCode:
 * 237. Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteMiddleNode {

  /**
   * Since we are unable to get the head of the linked list, we could change the current node value to the next one and
   * skip the next one
   * @param node
   */
  public void deleteMiddleNode(ListNode node) {
    node.data = node.next.data;
    node.next = node.next.next;
  }

}
