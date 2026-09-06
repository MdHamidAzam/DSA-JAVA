package LinkedList;

import LinkedList.DeleteNodeInLL.ListNode;

public class IntersectionOfTwoLL {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        int lenA = 0;
        while(tempA!=null){
            tempA = tempA.next;
            lenA++;
        }
        ListNode tempB = headB;
        int lenB = 0;
        while(tempB!=null){
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB;
        if(lenA>lenB){
            for(int i=1;i<=lenA-lenB;i++){
                tempA = tempA.next;
            }
        }
        else{
            for(int i=1;i<=lenB-lenA;i++){
                tempB = tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = new ListNode(8);
        headB.next.next.next.next = new ListNode(4);
        headB.next.next.next.next.next = new ListNode(5);
        
    }
}
