import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class merge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode marker = list.head;
        ListNode one; 
        ListNode two;
        while(!list1.isEmpty() && !list2.isEmpty()){
            if(!list1.isEmpty()){
                if(list.head == null){
                    list.head = list1.head;
                    list.head.next = null;
                    one = list1.next;

                }else{
                    marker = one;
                    one = one.next;
                    
                }
            }
        }
        
    }
}