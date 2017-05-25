package Ch2_LinkedList._1_RemoveDuplicates;

import Ch2_LinkedList.ListNode;
import Ch2_LinkedList.SingleLinkedList;

/**
 * Created by hengwang on 2017-05-24.
 */
public class RemoveDuplicatesTest {

  public static void main(String[] args) {

    ListNode head = new ListNode(2);
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(5);
    ListNode n3 = new ListNode(2);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(1);

    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    SingleLinkedList.printLinkedList(head);

    RemoveDuplicates Test = new RemoveDuplicates();
//    Test.removeDuplicates_HashSet(head);
//    Test.removeDuplicates_NoBuffer(head);
    Test.removeDuplicates_NoBuffer_2(head);

    SingleLinkedList.printLinkedList(head);
  }

}
