package algorithm.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 *
 * @author: zhouj-j
 * @since: 2018/9/30
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals = new ArrayList<>(numRows);
        if (numRows > 0) {
            List<Integer> row1 = new ArrayList<>(1);
            row1.add(1);
            pascals.add(row1);
            if (numRows >= 2) {
                List<Integer> row2 = new ArrayList<>(2);
                row2.add(1);
                row2.add(1);
                pascals.add(row2);
            }
            if (numRows >= 3) {
                for (int i = 2; i < numRows; i++) {
                    List<Integer> row = new ArrayList<>(i + 1);
                    row.add(1);
                    List<Integer> last = pascals.get(i - 1);
                    for (int j = 0; j < last.size() - 1; j++) {
                        row.add(last.get(j) + last.get(j + 1));
                    }
                    row.add(1);
                    pascals.add(row);
                }
            }
        }
        return pascals;
    }
}
