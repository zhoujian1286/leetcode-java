package algorithm.leetcode.easy;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author: zhouj-j
 * @since: 2018/9/21
 */
public class AddBinary067 {
    public String addBinary(String a, String b) {
        if (a == null || "".equals(a)) {
            return b;
        }
        if (b == null || "".equals(b)) {
            return a;
        }
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int min;
        char[] value;
        if (aChars.length < bChars.length) {
            min = aChars.length;
            value = bChars;
        } else {
            min = bChars.length;
            value = aChars;
        }
        int flag = 0;
        for (int i = 1; i <= min; i++) {
            char aChar = aChars[aChars.length - i];
            char bChar = bChars[bChars.length - i];

            if (aChar == '1' && bChar == '1') {
                if (flag == 0) {
                    value[value.length - i] = '0';
                    flag = 1;
                } else {
                    value[value.length - i] = '1';
                }
            } else if ((aChar ^ bChar) > 0) {
                if (flag == 0) {
                    value[value.length - i] = '1';
                } else {
                    value[value.length - i] = '0';
                    flag = 1;
                }
            } else {
                if (flag == 0) {
                    value[value.length - i] = '0';
                } else {
                    value[value.length - i] = '1';
                    flag = 0;
                }
            }
        }
        for (int i = min + 1; i <= value.length; i++) {
            if (flag == 0) {
                break;
            }
            if (value[value.length - i] == '1') {
                value[value.length - i] = '0';
            } else {
                value[value.length - i] = '1';
                flag = 0;
            }
        }
        if (flag == 1) {
            return "1" + new String(value);
        } else {
            return new String(value);
        }
    }
}
