/**
 * @Title: 灯泡开关 Ⅱ
 * @Author: Neo
 * @Date: 2022-09-15 15:13:51
 */
package leetcode.editor.cn;

public class P672_BulbSwitcherIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P672_BulbSwitcherIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int flipLights(int n, int presses) {
            if (n == 0 || presses == 0) {
                return 1;
            }
            if (n == 1) {
                return 2;
            }
            if (n == 2) {
                return presses == 1 ? 3 : 4;
            }
            if (presses == 1) {
                return 4;
            }
            return presses == 2 ? 7 : 8;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
