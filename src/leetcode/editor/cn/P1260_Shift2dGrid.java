/**
 * @Title: 二维网格迁移
 * @Author: Neo
 * @Date: 2022-07-20 19:49:30
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P1260_Shift2dGrid {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1260_Shift2dGrid().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int n = grid.length, m = grid[0].length;
            int[][] g = new int[n][m];
            for (int i = 0; i < m; i++) {
                int tcol = (i + k) % m, trow = ((i + k) / m) % n, idx = 0;
                while (idx != n) {
                    g[(trow++) % n][tcol] = grid[idx++][i];
                }
            }
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                {
                    List<Integer> list = new ArrayList<>();
                    for (int j = 0; j < m; j++) {
                        list.add(g[i][j]);
                    }
                    ans.add(list);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
