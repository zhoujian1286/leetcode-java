package algorithm.leetcode.easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 *
 * @author: zhoujian1286
 * @since: 2018/9/19
 */
public class LongestCommonPrefix014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        char[][] chars = new char[strs.length][];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = strs[i].toCharArray();
            if (chars[i].length < min) {
                min = chars[i].length;
            }
        }
        StringBuilder val = new StringBuilder();
        for (int j = 0; j < min; j++) {
            char first = chars[0][j];
            boolean same = true;
            for (char[] aChar : chars) {
                if (first != aChar[j]) {
                    same = false;
                }
            }
            if (!same) {
                return val.toString();
            } else {
                val.append(first);
            }
        }
        return val.toString();
    }
}
