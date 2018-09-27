package algorithm.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 *
 * @author: zhouj-j
 * @since: 2018/9/27
 */
public class BinaryTreeLevelOrderTraversalii107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        levelOrderBottom(root, 0, results);
        Collections.reverse(results);
        return results;
    }

    private void levelOrderBottom(TreeNode node, int level, List<List<Integer>> results) {
        if (node != null) {
            if (level >= results.size()) {
                List<Integer> list = new LinkedList<>();
                list.add(node.val);
                results.add(level, list);
            } else {
                results.get(level).add(node.val);
            }
            levelOrderBottom(node.left, level + 1, results);
            levelOrderBottom(node.right, level + 1, results);
        }
    }
}
