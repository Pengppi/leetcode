/**
 * @Title: 寻找重复的子树
 * @Author: Neo
 * @Date: 2022-09-05 14:21:26
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P652_FindDuplicateSubtrees {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P652_FindDuplicateSubtrees().new Solution();
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
        List<TreeNode> ans;

        Map<String, Integer> map;

        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            ans = new ArrayList<>();
            map = new HashMap<>();
            dfs(root);
            return ans;
        }

        private String dfs(TreeNode root) {
            if (root == null) {
                return " ";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(root.val).append("-");
            sb.append(dfs(root.left)).append(dfs(root.right));
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0)+1);
            int cnt = map.get(key);
            if (cnt == 2) {
                ans.add(root);
            }
            return key;
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
