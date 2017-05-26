package Ch2_LinkedList._2_ReturnKthToLast;

import Ch2_LinkedList.ListNode;
import Ch2_LinkedList.SingleLinkedList;

/**
 * Created by hengwang on 2017-05-25.
 */
public class ReturnKthToLastTest {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(4);
    ListNode n4 = new ListNode(5);

    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    SingleLinkedList.printLinkedList(head);

    ReturnKthToLast Test = new ReturnKthToLast();
    ListNode KthNodeToLast = Test.returnKthToLast(head, 5);

    System.out.println(KthNodeToLast.data);

  }
}
