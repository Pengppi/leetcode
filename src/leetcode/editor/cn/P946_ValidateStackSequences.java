/**
 * @Title: 验证栈序列
 * @Author: Neo
 * @Date: 2022-08-31 23:18:56
 */
package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

public class P946_ValidateStackSequences {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P946_ValidateStackSequences().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Deque<Integer> d = new ArrayDeque<>();
            int i = 0, j = 0;
            int n = pushed.length;
            while (i < n && j < n) {
                while (i < n && (d.isEmpty() || d.peek() != popped[j])) {
                    d.push(pushed[i++]);
                }
                while (j < n && !d.isEmpty() && d.peek() == popped[j]) {
                    d.pop();
                    j++;
                }
            }
            return d.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
