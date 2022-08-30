/**
 * @Title: 数组中的字符串匹配
 * @Author: Neo
 * @Date: 2022-08-06 19:59:36
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1408_StringMatchingInAnArray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1408_StringMatchingInAnArray().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> ans = new ArrayList<>();
            Arrays.sort(words,(a,b)->a.length()-b.length());
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].contains(words[i])) {
                        ans.add(words[i]);
                        break;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
