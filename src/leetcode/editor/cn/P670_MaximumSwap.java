/**
 * @Title: 最大交换
 * @Author: Neo
 * @Date: 2022-09-13 16:43:31
 */
package leetcode.editor.cn;

public class P670_MaximumSwap {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P670_MaximumSwap().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximumSwap(int num) {
            String str = String.valueOf(num);
            char[] cs = str.toCharArray();
            int n = cs.length;
            int mx = n - 1;
            int i1 = -1, i2 = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (cs[i] > cs[mx]) {
                    mx = i;
                } else if (cs[i] < cs[mx]) {
                    i1 = i;
                    i2 = mx;
                }
            }
            if (i1 >= 0) {
                char t = cs[i1];
                cs[i1] = cs[i2];
                cs[i2] = t;
                return Integer.parseInt(new String(cs));
            }
            return num;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
