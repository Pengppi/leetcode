/**
 * @Title: 移掉 K 位数字
 * @Author: Neo
 * @Date: 2022-08-30 23:26:20
 */
package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

public class P402_RemoveKDigits {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P402_RemoveKDigits().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeKdigits(String num, int k) {
            Deque<Character> d = new ArrayDeque<>();
            int n = num.length();
            for (int i = 0; i < n; i++) {
                char c = num.charAt(i);
                while (!d.isEmpty() && k > 0 && d.peekLast() > c) {
                    d.pollLast();
                    k--;
                }
                d.offerLast(c);
            }
            for (int i = 0; i < k; i++) {
                d.pollLast();
            }
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            while (!d.isEmpty()) {
                char c = d.pollFirst();
                if (first && c == '0') {
                    continue;
                }
                first = false;
                sb.append(c);
            }
            if (sb.length() == 0) {
                return "0";
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
