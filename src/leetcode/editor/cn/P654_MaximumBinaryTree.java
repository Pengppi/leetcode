/**
 * @Title: 最大二叉树
 * @Author: Neo
 * @Date: 2022-08-30 13:20:19
 */
package leetcode.editor.cn;

public class P654_MaximumBinaryTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P654_MaximumBinaryTree().new Solution();
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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return generate(nums, 0, nums.length - 1);
        }

        public TreeNode generate(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }
            int mx = start;
            for (int i = start + 1; i <= end; i++) {
                if (nums[i] > nums[mx]) {
                    mx = i;
                }
            }
            TreeNode root = new TreeNode(nums[mx]);
            root.left = generate(nums, start, mx - 1);
            root.right = generate(nums, mx + 1, end);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
