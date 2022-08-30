/**
 * @Title: 函数的独占时间
 * @Author: Neo
 * @Date: 2022-08-07 11:31:47
 */
package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class P636_ExclusiveTimeOfFunctions {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P636_ExclusiveTimeOfFunctions().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] exclusiveTime(int n, List<String> logs) {
            int[] ans = new int[n];
            Deque<Integer> d = new ArrayDeque<>();
            int time = 0;
            for (String log : logs) {
                String[] logarr = log.split(":");
                int id = Integer.parseInt(logarr[0]);
                if (logarr[1].equals("start")) {
                    if (!d.isEmpty()) {
                        ans[d.peekLast()] +=  Integer.parseInt(logarr[2])-time;
                    }
                    time = Integer.parseInt(logarr[2]);
                    d.addLast(id);
                } else {
                    ans[d.pollLast()] += Integer.parseInt(logarr[2]) - time + 1;
                    time = Integer.parseInt(logarr[2]) + 1;

                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}

