package algorithm.leetcode.easy;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author: zhoujian1286
 * @since: 2018/9/19
 */
public class PalindromeNumber009 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int reverse = 0, input = x;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        return reverse == input;
    }
}
