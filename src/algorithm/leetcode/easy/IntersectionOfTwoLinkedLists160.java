package algorithm.leetcode.easy;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * <p>
 * <p>
 * <p>
 * 例如，下面的两个链表：
 * <p>
 * A:          a1 → a2
 *                      ↘
 *                         c1 → c2 → c3
 *                      ↗
 * B:     b1 → b2 → b3
 * 在节点 c1 开始相交。
 * <p>
 * <p>
 * <p>
 * 注意：
 * <p>
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 *
 * @author: zhouj-j
 * @since: 2018/10/11
 */
public class IntersectionOfTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int aCount = 0;
        ListNode a = headA;
        while (a != null) {
            aCount++;
            a = a.next;
        }
        int bCount = 0;
        a = headB;
        while (a != null) {
            bCount++;
            a = a.next;
        }
        if (aCount < bCount) {
            int len = bCount - aCount;
            for (int i = 0; i < len; i++) {
                headB = headB.next;
            }
        } else if (aCount > bCount) {
            int len = aCount - bCount;
            for (int i = 0; i < len; i++) {
                headA = headA.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
