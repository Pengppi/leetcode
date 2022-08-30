/**
 * @Title: 完全二叉树插入器
 * @Author: Neo
 * @Date: 2022-07-25 15:07:42
 */
package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class P919_CompleteBinaryTreeInserter {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P919_CompleteBinaryTreeInserter().new Solution();
    }

    //力扣代码
    class Solution {

    }
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

    class CBTInserter {
        List<TreeNode> list = new ArrayList<>();
        int idx = 0;

        public CBTInserter(TreeNode root) {
            list.add(root);
            int cur = 0;
            while (cur < list.size()) {
                TreeNode node = list.get(cur);
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
                cur++;
            }
        }

        public int insert(int val) {
            TreeNode node = new TreeNode(val);
            while (list.get(idx).left != null && list.get(idx).right != null) {
                idx++;
            }
            TreeNode dad = list.get(idx);
            if (dad.left == null) {
                dad.left = node;
            } else if (dad.right == null) {
                dad.right = node;
            }
            list.add(node);
            return dad.val;
        }

        public TreeNode get_root() {
            return list.get(0);
        }
    }

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
