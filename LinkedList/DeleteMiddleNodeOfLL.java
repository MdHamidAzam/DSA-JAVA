package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class DeleteMiddleNodeOfLL {
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);

        ListNode result = deleteMiddle(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
