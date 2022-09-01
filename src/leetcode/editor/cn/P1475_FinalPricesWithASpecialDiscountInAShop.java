/**
 * @Title: 商品折扣后的最终价格
 * @Author: Neo
 * @Date: 2022-09-01 23:25:51
 */
package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

public class P1475_FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1475_FinalPricesWithASpecialDiscountInAShop().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] finalPrices(int[] prices) {
            int n = prices.length;
            int[] ans = prices.clone();
            Deque<int[]> d = new ArrayDeque<>();
            int i = 0;
            while (i < n) {
                while (i < n && !d.isEmpty() && prices[i] <= d.peekLast()[0]) {
                    int t[] = d.pollLast();
                    int discount = prices[i], idx = t[1];
                    ans[idx] -= discount;
                }
                while (i < n && (d.isEmpty() || prices[i] > d.peekLast()[0])) {
                    d.addLast(new int[]{prices[i], i});
                    i++;
                }
            }
            return ans;

        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
