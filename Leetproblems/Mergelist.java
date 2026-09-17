class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { 
        this.val = val; 
    }
     ListNode(int val, ListNode next) {
         this.val = val; 
         this.next = next;
         }
 }

public class Mergelist {
public static void main(String[] args) {
    Solution s = new Solution();

}
    
}
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode();
        newlist = list1;
        int s = list2.size();

        for (int i = 0; i<list2.size();i++) {
            
        }

        return newlist;
    }
}