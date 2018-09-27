package algorithm.leetcode.easy;

/**
 * @author: zhouj-j
 * @since: 2018/9/26
 */
public class RemoveDuplicatesFromSortedList083 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode next = current.next;
        while (next != null) {
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = current.next;
            }
            next = next.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}




