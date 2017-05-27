package Ch2_LinkedList._4_Partition;

import Ch2_LinkedList.ListNode;
import Ch2_LinkedList.SingleLinkedList;

/**
 * Created by hengwang on 2017-05-26.
 */
public class PartitionTest {

  public static void main(String[] args) {

    ListNode head = new ListNode(3);
    ListNode n1 = new ListNode(5);
    ListNode n2 = new ListNode(8);
    ListNode n3 = new ListNode(5);
    ListNode n4 = new ListNode(10);
    ListNode n5 = new ListNode(2);
    ListNode n6 = new ListNode(1);

    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;

    SingleLinkedList.printLinkedList(head);

    Partition Test = new Partition();

    ListNode newHead1 = Test.partition_Stable(head, 5);
    SingleLinkedList.printLinkedList(newHead1); // Expected: 3->2->1->5->8->5->10

//    ListNode newHead2 = Test.partition_NonStable(head, 5);
//    SingleLinkedList.printLinkedList(newHead2); // Expected: 1->2->3->5->8->5->10


    ListNode head_1 = new ListNode(1);
//    ListNode new_head_1 = Test.partition_Stable(head, 0); // Expected: 1

  }
}
