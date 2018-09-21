package algorithm.leetcode.easy;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * @author: zhouj-j
 * @since: 2018/9/21
 */
public class PlusOne066 {
    public int[] plusOne(int[] digits) {
        int pos = digits.length - 1;
        while (digits[pos] == 9) {
            pos--;
            if (pos == -1) {
                break;
            }
        }
        if (pos == -1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        } else {
            digits[pos] = digits[pos] + 1;
            for (int i = pos + 1; i <= digits.length - 1; i++) {
                digits[i] = 0;
            }
            return digits;
        }
    }
}
