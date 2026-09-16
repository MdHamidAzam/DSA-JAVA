package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class SortList {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);

        return MergeTwoLists.mergeTwoLists(firstHalf, secondHalf);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        head = sortList(head);
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
