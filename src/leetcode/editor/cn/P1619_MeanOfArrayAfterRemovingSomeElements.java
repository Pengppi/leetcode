/**
 * @Title: 删除某些元素后的数组均值
 * @Author: Neo
 * @Date: 2022-09-14 11:12:23
 */
package leetcode.editor.cn;

import java.util.Arrays;

public class P1619_MeanOfArrayAfterRemovingSomeElements {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1619_MeanOfArrayAfterRemovingSomeElements().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double trimMean(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);
            int sum = 0;
            int k = (int) (n * 0.05);
            for (int i = k; i < n - k; i++) {
                sum += arr[i];
            }
            return (double) sum / (n - 2 * k);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
