/**
 * @Title: 分割回文串
 * @Author: Neo
 * @Date: 2022-08-31 21:41:06
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P131_PalindromePartitioning {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P131_PalindromePartitioning().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            List<String> cur = new ArrayList<>();
            int n = s.length();
            char[] cs = s.toCharArray();
            boolean f[][] = new boolean[n][n];
            for (int j = 0; j < n; j++) {
                for (int i = j; i >= 0; i--) {
                     if (i == j) {
                        f[i][j] = true;
                    } else {
                        if (j - i + 1 == 2) {
                            f[i][j] = cs[i] == cs[j];
                        } else {
                            f[i][j] = cs[i] == cs[j] && f[i + 1][j - 1];
                        }
                    }
                }
            }
            dfs(ans, cur, f, s, 0);
            return ans;
        }

        private void dfs(List<List<String>> ans, List<String> cur, boolean[][] f, String s, int i) {
            if (i == s.length()) {
                ans.add(new ArrayList<>(cur));
            }
            for (int j = i; j < s.length(); j++) {
                if (f[i][j]) {
                    cur.add(s.substring(i, j + 1));
                    dfs(ans, cur, f, s, j + 1);
                    cur.remove(cur.size() - 1);
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
