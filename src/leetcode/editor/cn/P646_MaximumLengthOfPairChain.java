/**
 * @Title: 最长数对链
 * @Author: Neo
 * @Date: 2022-09-03 12:00:58
 */
package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P646_MaximumLengthOfPairChain {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P646_MaximumLengthOfPairChain().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLongestChain(int[][] pairs) {
            Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
            Deque<Integer> d = new ArrayDeque<>();
            d.addLast(pairs[0][1]);
            for (int i = 1; i < pairs.length;i++ ) {
                int l = pairs[i][0], r = pairs[i][1];
                if (l > d.peekLast()) {
                    d.addLast(r);
                }
            }
            return d.size();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
