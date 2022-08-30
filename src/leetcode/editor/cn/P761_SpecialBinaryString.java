/**
 * @Title: 特殊的二进制序列
 * @Author: Neo
 * @Date: 2022-08-08 20:54:50
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P761_SpecialBinaryString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P761_SpecialBinaryString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String makeLargestSpecial(String s) {
            if (s.length() == 0) {
                return s;
            }
            List<String> list = new ArrayList<String>();
            char[] cs = s.toCharArray();
            for (int i = 0, j = 0, k = 0; i < cs.length; i++) {
                k += cs[i] == '1' ? 1 : -1;
                if (k == 0) {
                    list.add("1" + makeLargestSpecial(s.substring(j + 1, i)) + "0");
                    j = i + 1;
                }
            }
            Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(str);
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
