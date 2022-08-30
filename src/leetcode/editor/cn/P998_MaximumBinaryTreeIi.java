/**
 * @Title: 最大二叉树 II
 * @Author: Neo
 * @Date: 2022-08-30 08:50:19
 */
package leetcode.editor.cn;


import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();

        public TreeNode insertIntoMaxTree(TreeNode root, int val) {
            dfs(root);
            list.add(val);
            return generate(list, 0, list.size() - 1);
        }

        private void dfs(TreeNode root) {
            if (root.left != null) {
                dfs(root.left);
            }
            list.add(root.val);
            if (root.right != null) {
                dfs(root.right);
            }
        }

        public TreeNode generate(List<Integer> list, int start, int end) {
            if (start > end) {
                return null;
            }
            int mx = start;
            for (int i = start + 1; i <= end; i++) {
                if (list.get(i) > list.get(mx)) {
                    mx = i;
                }
            }
            TreeNode root = new TreeNode(list.get(mx));
            root.left = generate(list, start, mx - 1);
            root.right = generate(list, mx + 1, end);
            return root;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
