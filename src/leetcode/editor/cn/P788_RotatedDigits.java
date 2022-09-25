/**
 * @Title: 旋转数字
 * @Author: Neo
 * @Date: 2022-09-25 14:24:44
 */
package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class P788_RotatedDigits {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P788_RotatedDigits().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Set<Integer> good;
        Set<Integer> valid;

        public int rotatedDigits(int n) {
            good = new HashSet<>();
            good.add(2);
            good.add(5);
            good.add(6);
            good.add(9);
            valid = new HashSet<>();
            valid.add(1);
            valid.add(8);
            valid.add(0);
            valid.addAll(good);
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                if (isGood(i)) {
                    cnt++;
                }
            }
            return cnt;
        }

        private boolean isGood(int x) {
            boolean flg = false;
            while (x > 0) {
                int t = x % 10;
                if (!valid.contains(t)) {
                    return false;
                }
                if (good.contains(t)) {
                    flg = true;
                }
                x/=10;
            }
            return flg;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
