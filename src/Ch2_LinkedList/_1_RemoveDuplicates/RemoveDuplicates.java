package Ch2_LinkedList._1_RemoveDuplicates;

import Ch2_LinkedList.ListNode;
import java.util.HashSet;

/**
 * Created by hengwang on 2017-05-24.
 *
 * Write code to remove duplicates from an UNSORTED linked list.
 *
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 * LeetCode:
 * 83. Remove Duplicates from **Sorted List**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicates {

  /**
   * Using a HashSet to check duplicated elements
   * @param head
   */
  public void removeDuplicates_HashSet(ListNode head) {
    if (head == null) {
      return;
    }
    // Use a HashSet to temporary store the elements of the linked list
    HashSet<Integer> set = new HashSet<>();
    ListNode current = head;
    ListNode previous = null;
    while (current != null) {
      if (!set.contains(current.data)) {
        set.add(current.data);
        previous = current;
      } else {
        previous.next = current.next;
      }
      current = current.next;
    }
  }

  /**
   * No Buffer allowed in the implementation
   *
   * This runs in O(1) space,but O(N^2) time
   * @param head
   */
  public void removeDuplicates_NoBuffer(ListNode head) {
    if (head == null) {
      return;
    }

    ListNode current = head;
    while (current != null) {
      ListNode currentTemp = current;
      while (currentTemp.next != null ) {
        if (current.data == currentTemp.next.data) {
          currentTemp.next = currentTemp.next.next;
        } else {
          currentTemp = currentTemp.next;
        }
      }
      current = current.next;
    }
  }

  /**
   * No Buffer allowed in the implementation.
   * Use a helper ListNode index = current; to remember the previous node.
   *
   * This runs in O(1) space,but O(N^2) time
   * @param head
   */
  public void removeDuplicates_NoBuffer_2(ListNode head) {
    if (head == null) {
      return;
    }

    ListNode current = head;
    while (current != null) {
      ListNode next = current.next;
      ListNode index = current;
      while (next != null) {
        if (next.data == current.data) {
          index.next = next.next;
        } else {
          index = next;
        }
        next = next.next;
      }
      current = current.next;
    }
  }

}
