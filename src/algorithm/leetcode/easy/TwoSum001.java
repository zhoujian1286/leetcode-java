package algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * @author: zhoujian1286
 * @since: 2018/9/19
 */
public class TwoSum001 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{0, 0};
        }
        Map<Integer, Integer> cache = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            cache.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer val = cache.get(nums[i]);
            if (val != null && val != i) {
                return new int[]{val, i};
            }
        }
        return new int[]{0, 0};


    }

}
