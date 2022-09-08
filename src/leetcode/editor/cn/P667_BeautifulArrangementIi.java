/**
 * @Title: 优美的排列 II
 * @Author: Neo
 * @Date: 2022-09-08 10:57:22
 */
package leetcode.editor.cn;

public class P667_BeautifulArrangementIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P667_BeautifulArrangementIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] constructArray(int n, int k) {
            int[] ans = new int[n];
            int i = 0;
            int l = 1;
            int r = n;
            while (l <= r) {
                if (k > 1) {
                    ans[i++] = k-- % 2 == 1 ? l++ : r--;
                } else {
                    ans[i++] = l++;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
