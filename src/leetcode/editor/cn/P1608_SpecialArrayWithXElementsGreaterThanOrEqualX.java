/**
 * @Title: 特殊数组的特征值
 * @Author: Neo
 * @Date: 2022-09-12 11:02:06
 */
package leetcode.editor.cn;

import java.util.Arrays;

public class P1608_SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1608_SpecialArrayWithXElementsGreaterThanOrEqualX().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            for (int i = 1; i <= n; i++) {
                if (nums[n - i] >= i) {
                    if (i == n) {
                        return i;
                    } else if (nums[n - i - 1] < i) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
