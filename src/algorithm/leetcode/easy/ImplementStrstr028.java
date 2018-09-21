package algorithm.leetcode.easy;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * @author: zhouj-j
 * @since: 2018/9/20
 */
public class ImplementStrstr028 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        char[] haystacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        if (needles.length > haystacks.length) {
            return -1;
        }
        for (int i = 0; i <= haystacks.length - needles.length; i++) {
            boolean found = true;
            for (int j = 0; j < needles.length; j++) {
                if (haystacks[i + j] != needles[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}
