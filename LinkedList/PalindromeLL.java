package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class PalindromeLL {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode midNode = MiddleOfTheLL.middleNode(head);
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev;
        ListNode left = head;

        while(right != null) {
            if(left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }
}
