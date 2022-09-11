/**
 * @Title: 雇佣 K 名工人的最低成本
 * @Author: Neo
 * @Date: 2022-09-11 10:50:07
 */
package leetcode.editor.cn;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P857_MinimumCostToHireKWorkers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P857_MinimumCostToHireKWorkers().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            int n = quality.length;
            double t[][] = new double[n][2];
            for (int i = 0; i < n; i++) {
                t[i][0] = wage[i] * 1.0 / quality[i];
                t[i][1] = i;
            }
            Arrays.sort(t, (a, b) -> Double.compare(a[0], b[0]));
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
            double ans = 1e18;
            for (int i = 0, tot = 0; i < n; i++) {
                int cur = quality[(int) t[i][1]];
                tot += cur;
                pq.add(cur);
                if (pq.size() > k) {
                    tot -= pq.poll();
                }
                if (pq.size() == k) {
                    ans = Math.min(ans, tot * t[i][0]);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
