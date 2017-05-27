package Ch2_LinkedList._4_Partition;

import Ch2_LinkedList.ListNode;

/**
 * Created by hengwang on 2017-05-26.
 *
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater
 * than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x
 * (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between
 * the left and right partitions.
 *
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition=5]
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 *
 */
public class Partition {

  /**
   * Create two new linked list to store the left and right, then merge them into one.
   *
   * This approach is mostly "stable" in that elements stay in their original order, other than the necessary
   * movement around the partition.
   * @param head
   * @param val
   * @return
   */
  public ListNode partition_Stable(ListNode head, int val) {

    ListNode leftStart = null, left = null, rightStart = null, right = null;
    ListNode current = head;

    while (current != null) {
      ListNode next = current.next;
      current.next = null;
      if (current.data < val) {
        if (left == null) {
          leftStart = current;
          left = leftStart;
        } else {
          left.next = current;
          left = left.next;
        }
      } else {
        if (right == null) {
          rightStart = current;
          right = rightStart;
        } else {
          right.next = current;
          right = right.next;
        }
      }
      current = next;
    }

    if (leftStart == null) {
      return rightStart;
    }

    // Merge left and right linked lists into one
    left.next = rightStart;
    return leftStart;
  }

  /**
   *
   * "Non stable" version as the elements might NOT stay in their original order
   *
   * @param head
   * @param val
   * @return
   */
  public ListNode partition_NonStable(ListNode head, int val) {

    ListNode begin   = head;
    ListNode end     = head;
    ListNode current = head;

    while (current != null) {
      ListNode next = current.next;
      if (current.data < val) {
        current.next = begin;
        begin = current;
      } else {
        end.next = current;
        end = current;
      }
      current = next;
    }
    end.next = null;

    return begin;
  }
}
