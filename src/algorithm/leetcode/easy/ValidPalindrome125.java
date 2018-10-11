package algorithm.leetcode.easy;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 *
 * @author: zhouj-j
 * @since: 2018/10/11
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i <= j) {
            while (i < chars.length && !((chars[i] >= 'a' && chars[i] <= 'z')
                    || (chars[i] >= 'A' && chars[i] <= 'Z')
                    || (chars[i] >= '0' && chars[i] <= '9'))) {
                i++;
            }
            while (j >= 0 && !((chars[j] >= 'a' && chars[j] <= 'z')
                    || (chars[j] >= 'A' && chars[j] <= 'Z')
                    || (chars[j] >= '0' && chars[j] <= '9'))) {
                j--;
            }
            if (i > j) {
                return true;
            }
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                if ((chars[i] >= 'a' && chars[i] <= 'z' && chars[i] - 32 == chars[j]) || (chars[i] >= 'A' && chars[i] <= 'Z' && chars[i] + 32 == chars[j])) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }


        }
        return true;
    }
}
