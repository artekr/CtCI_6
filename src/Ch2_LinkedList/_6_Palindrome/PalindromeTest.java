package Ch2_LinkedList._6_Palindrome;

import Ch2_LinkedList.ListNode;
import Ch2_LinkedList.SingleLinkedList;

/**
 * Created by hengwang on 2017-05-27.
 */
public class PalindromeTest {

  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(4);
    ListNode n4 = new ListNode(3);
    ListNode n5 = new ListNode(2);
    ListNode n6 = new ListNode(1);

    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;

    SingleLinkedList.printLinkedList(head);

    Palindrome Test = new Palindrome();
    System.out.println(Test.isPalindrome(head)); // Expected: true

    /*******************************************************/
    ListNode head_1 = new ListNode(1);
    ListNode n_1 = new ListNode(2);
    ListNode n_2 = new ListNode(3);
    ListNode n_3 = new ListNode(2);
    ListNode n_4 = new ListNode(4);

    head_1.next = n_1;
    n_1.next = n_2;
    n_2.next = n_3;
    n_3.next = n_4;

    SingleLinkedList.printLinkedList(head_1);

    Palindrome Test2 = new Palindrome();
    System.out.println(Test2.isPalindrome(head_1)); // Expected: false
  }
}
