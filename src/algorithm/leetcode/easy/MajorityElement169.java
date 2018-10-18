package algorithm.leetcode.easy;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * @author: zhouj-j
 * @since: 2018/10/15
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = 0;
        int count = 0;
        for (int n : nums) {
            if (count == 0) {
                result = n;
                count = 1;
            } else if (result == n) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }
}
