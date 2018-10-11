package algorithm.leetcode.easy;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * @author: zhouj-j
 * @since: 2018/10/11
 */
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
            if (fast == null) {
                return false;
            }
        }
        return false;
    }
}
