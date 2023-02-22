class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		while (current.next != null) {
			if (current.val != current.next.val) {
				current = current.next;
			} 
			else {
				if (current.next.next != null) {
					current.next = current.next.next;
				} 
				else {
					current.next = null;
				}
			}
		}
		return head;
	}
}