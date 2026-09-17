package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class SwapNodesInPair {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;

        while(curr != null && curr.next != null) {
            ListNode next = curr.next.next;

            prev.next = curr.next;
            curr.next.next = curr;
            curr.next = next;

            prev = curr;
            curr = next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head = swapPairs(head);
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
