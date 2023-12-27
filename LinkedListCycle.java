// Time: O(n)
// Space: O(n) - Not optimal (O(1))
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();

        while (head != null) {
            if(map.containsKey(head.next) && map.get(head.next) == head.val){
                return true;
            }
            map.put(head.next, head.val);
            head = head.next;
        }
        return false;
    }
}