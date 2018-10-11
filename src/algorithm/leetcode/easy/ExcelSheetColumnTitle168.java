package algorithm.leetcode.easy;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * <p>
 * 例如，
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 * <p>
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 * <p>
 * 输入: 701
 * 输出: "ZY"
 *
 * @author: zhouj-j
 * @since: 2018/10/11
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        String[] strs = new String[]{"", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"
                , "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int s = n / 26, y = n % 26;
        if (y == 0) {
            s = s - 1;
            y = 26;
        }
        if (s > 0) {
            return convertToTitle(s) + strs[y];
        } else {
            return strs[y];
        }
    }
}
