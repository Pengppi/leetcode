/**
 * @Title: 优美的排列
 * @Author: Neo
 * @Date: 2022-09-01 10:28:43
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P526_BeautifulArrangement {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P526_BeautifulArrangement().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countArrangement(int n) {
            List<List<Integer>> ans = new ArrayList<>();
            boolean[] f = new boolean[n + 1];
            dfs(ans, new ArrayList<>(), n, f);
            return ans.size();
        }

        private void dfs(List<List<Integer>> ans, ArrayList<Integer> cur, int n, boolean[] f) {
            int len = cur.size();
            if (len > 0) {
                if (cur.get(len - 1) % len == 0 || len % cur.get(len - 1) == 0) {
                    if (len == n) {
                        ans.add(new ArrayList<>(cur));
                        return;
                    }
                } else {
                    return;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (!f[i]) {
                    f[i] = true;
                    cur.add(i);
                    dfs(ans, cur, n, f);
                    cur.remove(cur.size() - 1);
                    f[i] = false;
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
