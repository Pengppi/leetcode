/**
 * @Title: 拆炸弹
 * @Author: Neo
 * @Date: 2022-09-24 15:12:10
 */
package leetcode.editor.cn;

public class P1652_DefuseTheBomb {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1652_DefuseTheBomb().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] ans = new int[n];
            if (k > 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j <= i + k; j++) {
                        ans[i] += code[j % n];
                    }
                }
            }
            if (k < 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = i - 1; j >= i + k; j--) {
                        ans[i] += code[(j + n) % n];
                    }
                }
            }
            return ans;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
