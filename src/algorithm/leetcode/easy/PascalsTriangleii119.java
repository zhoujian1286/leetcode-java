package algorithm.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 * <p>
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 *
 * @author: zhouj-j
 * @since: 2018/9/30
 */
public class PascalsTriangleii119 {
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        if (rowIndex <= 0) {
            return new ArrayList<>();
        }
        if (rowIndex == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }
        List<Integer> row = new ArrayList<>(rowIndex);
        row.add(1);
        row.add(1);
        for (int i = 3; i <= rowIndex; i++) {
            row.add(1);
            for (int j = row.size() - 2; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }


}
