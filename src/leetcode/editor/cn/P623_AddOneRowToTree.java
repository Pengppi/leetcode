/**
 * @Title: 在二叉树中增加一行
 * @Author: Neo
 * @Date: 2022-08-05 15:50:53
 */
package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

public class P623_AddOneRowToTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P623_AddOneRowToTree().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     */
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

    class Solution {
        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if (depth == 1) {
                TreeNode newNode = new TreeNode(val);
                newNode.left = root;
                return newNode;
            }
            Deque<TreeNode> d = new ArrayDeque<>();
            d.add(root);
            int level = 1;
            while (level < depth) {
                for (int i = d.size(); i > 0; i--) {
                    TreeNode node = d.pollFirst();
                    if (level == depth - 1) {
                        TreeNode newNode = new TreeNode(val);
                        newNode.left = node.left;
                        node.left = newNode;
                        newNode = new TreeNode(val);
                        newNode.right = node.right;
                        node.right = newNode;
                    } else {
                        if (node.left != null) {
                            d.addLast(node.left);
                        }
                        if (node.right != null) {
                            d.addLast(node.right);
                        }
                    }
                }
                level++;
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
