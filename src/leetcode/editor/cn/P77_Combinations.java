/**
 * @Title: 组合
 * @Author: Neo
 * @Date: 2022-09-01 10:56:42
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P77_Combinations {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P77_Combinations().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            dfs(ans, new ArrayList<>(), 1, n, k);
            return ans;
        }

        private void dfs(List<List<Integer>> ans, ArrayList<Integer> cur, int i, int n, int k) {
            if (cur.size() == k) {
                ans.add(new ArrayList<>(cur));
                return;
            }
            for (int j = i; j <= n; j++) {
                cur.add(j);
                dfs(ans, cur, j + 1, n, k);
                cur.remove(cur.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
