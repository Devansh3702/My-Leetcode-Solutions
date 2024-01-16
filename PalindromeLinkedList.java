import java.util.Stack;

// Not Optimal
// Time: O(n)
// Space: O(n)
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int mid = size / 2;
        temp = head;
        Stack<Integer> stack = new Stack<>();

        while (mid > 0) {
            stack.push(temp.val);
            temp = temp.next;
            mid--;
        }

        if (size % 2 == 1) {
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            if (temp.val != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}