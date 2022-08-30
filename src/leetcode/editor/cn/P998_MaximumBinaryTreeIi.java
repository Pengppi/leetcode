/**
 * @Title: 最大二叉树 II
 * @Author: Neo
 * @Date: 2022-08-30 08:50:19
 */
package leetcode.editor.cn;

public class P998_MaximumBinaryTreeIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P998_MaximumBinaryTreeIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    class Solution {
        public TreeNode insertIntoMaxTree(TreeNode root, int val) {

            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
