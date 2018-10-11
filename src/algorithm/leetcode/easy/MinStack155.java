package algorithm.leetcode.easy;

import com.sun.istack.internal.NotNull;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 * @author: zhouj-j
 * @since: 2018/10/11
 */
public class MinStack155 {

    static class MinStack {
        Node head;
        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int x) {
            Node n = new Node();
            n.val = x;
            if (head == null) {
                n.min = n;
                head = n;
            } else {
                n.next = head;
                if (head.min.val < x) {
                    n.min = head.min;
                } else {
                    n.min = n;
                }
                head = n;
            }
        }

        public void pop() {
            if (head != null) {
                Node p = head;
                head = head.next;
                p = null;
            }
        }

        public int top() {
            if (head != null) {
                return head.val;
            }
            throw new IllegalArgumentException();
        }

        public int getMin() {
            if (head != null) {
                return head.min.val;
            }
            throw new IllegalArgumentException();
        }

        class Node {
            int val;
            Node next;
            Node min;
        }
    }
}
