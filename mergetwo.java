

public class mergetwo {

    class ListNode{

        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode head = null;

    public void addEnd(int val) { 
        ListNode newNode = new ListNode(val);
        
        if(head == null){
            head = newNode;
        }else{
            ListNode endNode = head;
            while(endNode.next != null){
                endNode = endNode.next;
            }
            endNode.next = newNode;
        }
    }
    public void addAfter(int val, int afterVal) {
        
        ListNode after = findNode(val);
        ListNode before = after.next;
        ListNode newNode = new ListNode(val);
        after.next = newNode;
        newNode.next = before;

    }

    public ListNode findNode(int find){
        
        ListNode x = head;
        while(x.val != find){
            x = x.next;
        }

        return x;
    }

    public static void main(String[] args){
        
        mergetwo newList = new mergetwo();
        newList.addEnd(1);
        newList.addEnd(2);
        newList.addEnd(3);
        
        mergetwo secList = new mergetwo();
        secList.addEnd(1);
        secList.addEnd(1);
        secList.addEnd(1);

        mergetwo combine = new mergetwo();
        

        
    }

}