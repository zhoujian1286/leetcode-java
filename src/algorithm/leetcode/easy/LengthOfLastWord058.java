package algorithm.leetcode.easy;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * @author: zhouj-j
 * @since: 2018/9/21
 */
public class LengthOfLastWord058 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int size = 0;
        int start = chars.length - 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int i = start; i >= 0; i--) {
            if (chars[i] != ' ') {
                size++;
            } else {
                break;
            }
        }
        return size;
    }
}
