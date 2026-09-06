package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class PartitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);
        MiddleOfTheLL.printList(head);

        ListNode small = smallDummy;
        ListNode big = bigDummy;

        while(head != null) {
            if(head.val < x) {
                small.next = head;
                small = small.next;
            } else { // x >= head.val
                big.next = head;
                big = big.next;
            }
            
            head = head.next;
        }

        // terminate the big list
        big.next = null;

        // Connect small list with big list
        small.next = bigDummy.next;

        return smallDummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        head = partition(head, 3);
        MiddleOfTheLL.printList(head);
    }
}
