/**
 * @Title: 最长同值路径
 * @Author: Neo
 * @Date: 2022-09-02 10:35:16
 */
package leetcode.editor.cn;

public class P687_LongestUnivaluePath {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P687_LongestUnivaluePath().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

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
        int ans = 0;

        public int longestUnivaluePath(TreeNode root) {
            dfs(root);
            return ans;
        }

        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = dfs(root.left);
            int right = dfs(root.right);
            if (root.left != null && root.left.val == root.val) {
                left += 1;
            } else {
                left = 0;
            }
            if (root.right != null && root.right.val == root.val) {
                right += 1;
            } else {
                right = 0;
            }
            ans = Math.max(ans, left + right);
            return Math.max(left, right);
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
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
}
