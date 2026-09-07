package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class ReverseLinkedList {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;;
        ListNode curr  = head;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head = reverse(head);
        ListNode current = head;
        
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
