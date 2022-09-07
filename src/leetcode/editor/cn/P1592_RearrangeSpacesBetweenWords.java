/**
 * @Title: 重新排列单词间的空格
 * @Author: Neo
 * @Date: 2022-09-07 16:21:36
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P1592_RearrangeSpacesBetweenWords {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1592_RearrangeSpacesBetweenWords().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reorderSpaces(String text) {
            int cnt = 0;
            List<String> words = new ArrayList<>();
            for (int i = 0; i < text.length(); ) {
                if (text.charAt(i) == ' ' && ++i >= 0 && ++cnt >= 0) {
                    continue;
                }
                int j = i;
                while (j < text.length() && text.charAt(j) != ' ') {
                    j++;
                }
                words.add(text.substring(i, j));
                i = j;
            }
            int num = words.size() - 1;
            int spaceNum = num == 0 ? cnt : cnt / num;
            StringBuilder sb = new StringBuilder();
            String space = "";
            for (int i = 0; i < spaceNum; i++) {
                space += " ";
            }
            for (int i = 0; i < words.size(); i++) {
                sb.append(words.get(i));
                if (i != words.size() - 1) {
                    sb.append(space);
                }
            }
            while (sb.length() != text.length()) {
                sb.append(" ");
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
