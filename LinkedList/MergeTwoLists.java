package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                prev.next = temp1;
                temp1 = temp1.next;
            } else {
                prev.next = temp2;
                temp2 = temp2.next;
            }

            prev = prev.next;
        }

        if (temp1 == null) prev.next = temp2;
        else prev.next = temp1;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(10);
        headA.next = new ListNode(30);
        headA.next.next = new ListNode(40);
        headA.next.next.next = new ListNode(60);

        ListNode headB = new ListNode(20);
        headB.next = new ListNode(50);
        headB.next.next = new ListNode(70);
        headB.next.next.next = new ListNode(75);
        headB.next.next.next.next = new ListNode(80);

        ListNode current = mergeTwoLists(headA, headB);

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
