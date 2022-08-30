/**
 * @Title: 重新格式化字符串
 * @Author: Neo
 * @Date: 2022-08-11 17:54:25
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P1417_ReformatTheString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1417_ReformatTheString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reformat(String s) {
            int num = 0, letter = 0;
            char[] cs = s.toCharArray();
            List<Character> nums = new ArrayList<>();
            List<Character> letters = new ArrayList<>();
            for (char c : cs) {
                if (c >= '0' && c <= '9') {
                    nums.add(c);
                } else {
                    letters.add(c);
                }
            }
            num = nums.size();
            letter = letters.size();
            if (Math.abs(num - letter) > 1) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            if (num > letter) {
                int idx = 0;
                for (int i = 0; i < num; i++) {
                    sb.append(nums.get(i));
                    if (idx < letter) {
                        sb.append(letters.get(idx));
                        idx++;
                    }
                }
            } else {
                int idx = 0;
                for (int i = 0; i < letter; i++) {
                    sb.append(letters.get(i));
                    if (idx < num) {
                        sb.append(nums.get(idx));
                        idx++;
                    }
                }
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
