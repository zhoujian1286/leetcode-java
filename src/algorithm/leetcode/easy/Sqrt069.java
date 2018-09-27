package algorithm.leetcode.easy;

/**
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 *
 * @author: zhouj-j
 * @since: 2018/9/26
 */
public class Sqrt069 {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int s = x / 2;
        int v = x / s;
        while (Math.abs(s - v) > 1) {
            s = (v + s) / 2;
            v = x / s;
        }
        return s > v ? v : s;

    }
}
