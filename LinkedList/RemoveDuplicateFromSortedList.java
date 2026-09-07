package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class RemoveDuplicateFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode a = head;
        ListNode b = head;

        while(b != null) {
            if(a.val == b.val) b = b.next;
            else {
                a.next = b;
                a = b;
            }
        }

        a.next = null;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        
        head = deleteDuplicates(head);
        ListNode current = head;
        
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
