/**
 * @Title: 二进制矩阵中的特殊位置
 * @Author: Neo
 * @Date: 2022-09-04 00:29:33
 */
package leetcode.editor.cn;

import java.util.Arrays;

public class P1582_SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1582_SpecialPositionsInABinaryMatrix().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numSpecial(int[][] mat) {
            int m = mat.length, n = mat[0].length;
            int[] row = new int[m];
            int[] col = new int[n];
            for (int i = 0; i < m; i++) {
                row[i] = Arrays.stream(mat[i]).sum();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    col[i] += mat[j][i];
                }
            }
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
