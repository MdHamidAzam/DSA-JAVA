package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class MergeKLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        while(lists.length > 1) {
            int newSize = (lists.length+1)/2;
            ListNode[] mergedList = new ListNode[newSize];
            int index = 0;

            for(int i=0; i<lists.length; i+=2) {
                ListNode l1 = lists[i];
                ListNode l2 = null;

                if(i+1 < lists.length) l2 = lists[i+1];

                mergedList[index] = MergeTwoLists.mergeTwoLists(l1, l2);
                index++;
            }
            lists = mergedList;
        }

        return lists[0];
    }
    public static void main(String[] args) {
        // List 1: 1 -> 4 -> 5
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(5);

    // List 2: 1 -> 3 -> 4
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    // List 3: 2 -> 6
    ListNode l3 = new ListNode(2);
    l3.next = new ListNode(6);

    // Array of linked lists
    ListNode[] lists = {l1, l2, l3};

    // Merge K Lists
    ListNode result = mergeKLists(lists);

    // Print result
    while(result != null) {
        System.out.print(result.val + " -> ");
        result = result.next;
    }

    System.out.println("null");
    }
}
