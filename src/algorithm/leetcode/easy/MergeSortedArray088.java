package algorithm.leetcode.easy;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 *
 * @author: zhouj-j
 * @since: 2018/9/26
 */
public class MergeSortedArray088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int i = n - 1;
        int j = m - 1;

        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[j] > nums2[i]) {
                nums1[k] = nums1[j];
                j--;
            } else {
                nums1[k] = nums2[i];
                i--;
            }
            k--;
        }
        while (i >= 0) {
            nums1[k] = nums2[i];
            i--;
            k--;
        }
    }
}
