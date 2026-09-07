package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        if(head == null  || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;
        }

        if(fast != slow) return null;
        ListNode prev = head;
        while(prev != slow) {
            slow = slow.next;
            prev = prev.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;
        int pos = 1;

        System.out.println(detectCycle(head).val);
    }
}
