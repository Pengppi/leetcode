/**
 * @Title: 划分为k个相等的子集
 * @Author: Neo
 * @Date: 2022-09-01 15:47:13
 */
package leetcode.editor.cn;

import java.util.Arrays;

public class P698_PartitionToKEqualSumSubsets {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P698_PartitionToKEqualSumSubsets().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int tot = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                tot += nums[i];
            }
            if (tot % k != 0) {
                return false;
            }
            int t = tot / k;
            Arrays.sort(nums);
            if (nums[n - 1] > t) {
                return false;
            }
            int b[] = new int[k];
            return dfs(nums, b, 0, k, t);
        }

        private boolean dfs(int[] nums, int[] b, int index, int k, int t) {
            if (index == nums.length) {
                return true;
            }

            for (int i = 0; i < k; i++) {
                if (i > 0 && index == 0) {
                    break;
                }
                if (i > 0 && b[i] == b[i - 1]) {
                    continue;
                }
                if (b[i] + nums[index] > t) {
                    continue;
                }
                b[i] += nums[index];
                if (dfs(nums, b, index + 1, k, t)) {
                    return true;
                }
                b[i] -= nums[index];
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
