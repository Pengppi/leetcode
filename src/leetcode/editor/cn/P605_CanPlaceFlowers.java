/**
 * @Title: 种花问题
 * @Author: Neo
 * @Date: 2022-08-31 17:47:32
 */
package leetcode.editor.cn;

public class P605_CanPlaceFlowers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P605_CanPlaceFlowers().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int len = flowerbed.length;
            for (int i = 0; i < len && n > 0; ) {
                if (flowerbed[i] == 1) {
                    i += 2;
                } else if (i == len - 1 || flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    i += 2;
                } else {
                    i += 3;
                }
            }
            return n <= 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
