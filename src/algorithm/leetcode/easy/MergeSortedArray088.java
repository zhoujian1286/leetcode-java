package algorithm.leetcode.easy;

/**
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
