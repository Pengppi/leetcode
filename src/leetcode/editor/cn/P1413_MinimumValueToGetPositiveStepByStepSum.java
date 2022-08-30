/**
 * @Title: 逐步求和得到正数的最小值
 * @Author: Neo
 * @Date: 2022-08-09 23:50:11
 */
package leetcode.editor.cn;

public class P1413_MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1413_MinimumValueToGetPositiveStepByStepSum().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minStartValue(int[] nums) {
            int ans = 1;
            int sum = ans;
            int cnt = 0;
            while (cnt < nums.length) {
                sum += nums[cnt++];
                if (sum < 1) {
                    ans += 1 - sum;
                    cnt = 0;
                    sum = ans;
                }
            }
			return ans;
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}
