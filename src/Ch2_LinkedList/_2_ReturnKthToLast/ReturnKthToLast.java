package Ch2_LinkedList._2_ReturnKthToLast;

import Ch2_LinkedList.ListNode;

/**
 * Created by hengwang on 2017-05-25.
 *
 * Return Kth to Last: Implement an algorithm to find the Kth to last element of a singly linked list.
 *
 * LeetCode:
 * 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 */
public class ReturnKthToLast {

  /**
   * Naive approach, first count the number of elements in linked list,
   * then calculate the index from the head and return the node.
   * @param head
   * @param k
   * @return
   */
  public ListNode returnKthToLast(ListNode head, int k) {

    int count = 0;
    ListNode current = head;
    while (current != null) {
      current = current.next;
      count++;
    }
    int index = 0;
    ListNode KthNodeToLast = head;
    while (index < count - k) {
      KthNodeToLast = KthNodeToLast.next;
      index++;
    }
    return KthNodeToLast;
  }

}
