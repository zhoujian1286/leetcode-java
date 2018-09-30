package algorithm.leetcode.easy;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \      \
 * 7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * @author: zhouj-j
 * @since: 2018/9/30
 */
public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        return null != root && pathSum(root, sum);
    }

    private boolean pathSum(TreeNode node, int sum) {
        if (node == null) {
            return sum == 0;
        }
        int i = sum - node.val;
        if (node.left == null) {
            return pathSum(node.right, i);
        }
        if (node.right == null) {
            return pathSum(node.left, i);
        }
        boolean leftPath = pathSum(node.left, i);
        boolean rightPath = pathSum(node.right, i);
        return leftPath || rightPath;
    }
}
