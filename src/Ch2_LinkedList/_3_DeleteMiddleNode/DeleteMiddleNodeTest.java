package Ch2_LinkedList._3_DeleteMiddleNode;

import Ch2_LinkedList.ListNode;
import Ch2_LinkedList.SingleLinkedList;


/**
 * Created by hengwang on 2017-05-25.
 */
public class DeleteMiddleNodeTest {
  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(4);
    ListNode n4 = new ListNode(5);
    ListNode n5 = new ListNode(6);

    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    SingleLinkedList.printLinkedList(head);

    DeleteMiddleNode Test = new DeleteMiddleNode();
    Test.deleteMiddleNode(n2);

    // Expected: 1->2->4->5->6
    SingleLinkedList.printLinkedList(head);
  }
}
