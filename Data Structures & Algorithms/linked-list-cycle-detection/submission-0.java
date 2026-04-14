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

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> var = new HashSet<ListNode>();
        ListNode currentHead = head;
        while(currentHead != null){
            if(var.contains(currentHead))return true;
            var.add(currentHead);
            currentHead = currentHead.next;
            
        }
        return false;

    }
}
