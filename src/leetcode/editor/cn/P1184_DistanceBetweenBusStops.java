/**
 * @Title: 公交站间的距离
 * @Author: Neo
 * @Date: 2022-07-24 14:37:04
 */
package leetcode.editor.cn;

public class P1184_DistanceBetweenBusStops {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1184_DistanceBetweenBusStops().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int dis1 = 0;
            int dis2 = 0;
            int cur = start;
            while (cur != destination) {
                dis1 += distance[cur];
                cur = (cur + 1) % distance.length;
            }
            while (cur != start) {
                dis2 += distance[cur];
                cur = (cur + 1 + distance.length) % distance.length;
            }
            return Math.min(dis1, dis2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
