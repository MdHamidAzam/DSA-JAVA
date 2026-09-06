package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class DeleteNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        MiddleOfTheLL.printList(head);

        for(int i=1; i<=n; i++) {
            fast = fast.next;
        }

        if(fast == null) return head.next;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = removeNthFromEnd(head, 5);
        MiddleOfTheLL.printList(head);
    }
}
