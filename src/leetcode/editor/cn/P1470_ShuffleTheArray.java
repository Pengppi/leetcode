/**
 * @Title: 重新排列数组
 * @Author: Neo
 * @Date: 2022-08-29 14:46:36
 */
package leetcode.editor.cn;

public class P1470_ShuffleTheArray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1470_ShuffleTheArray().new Solution();

    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[nums.length];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                ans[idx++] = nums[i];
                ans[idx++] = nums[i + n];
            }
			return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
