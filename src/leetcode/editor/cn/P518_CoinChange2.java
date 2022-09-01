/**
 * @Title: 零钱兑换 II
 * @Author: Neo
 * @Date: 2022-09-01 23:19:03
 */
package leetcode.editor.cn;

public class P518_CoinChange2 {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P518_CoinChange2().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int change(int amount, int[] coins) {
            int dp[] = new int[amount + 1];
            dp[0] = 1;
            for (int coin : coins) {
                for (int i = coin; i <= amount; i++) {
                    dp[i] += dp[i - coin];
                }
            }
            return dp[amount];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
