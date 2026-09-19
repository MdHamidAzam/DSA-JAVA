package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class SplitLLinParts {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;

        while(curr != null) {
            n++;
            curr = curr.next;
        }

        int base = n/k;
        int extra = n%k;

        ListNode[] arr = new ListNode[k];
        curr = head;

        for(int i=0; i<k; i++) {
            arr[i] = curr;

            int size = base + (i<extra ? 1 : 0);

            for(int j=1; j<size && curr != null; j++) curr = curr.next;

            if(curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode[] parts = splitListToParts(head, 3);
        
        for(int i=0; i<parts.length; i++) {
            ListNode current = parts[i];
            System.out.print("Part " +(i+1)+ ": ");

            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }

            System.out.println();
        }
    }
}
