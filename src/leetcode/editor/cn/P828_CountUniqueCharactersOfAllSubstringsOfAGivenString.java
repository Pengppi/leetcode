/**
 * @Title: 统计子串中的唯一字符
 * @Author: Neo
 * @Date: 2022-09-06 16:29:55
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P828_CountUniqueCharactersOfAllSubstringsOfAGivenString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P828_CountUniqueCharactersOfAllSubstringsOfAGivenString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniqueLetterString(String s) {
            int n = s.length();
            Map<Character, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, new ArrayList<>());
                    map.get(c).add(-1);
                }
                map.get(c).add(i);
            }
            int ans = 0;
            for (Character c : map.keySet()) {
                List<Integer> list = map.get(c);
                list.add(n);
                for (int i = 1; i < list.size() - 1; i++) {
                    int left = list.get(i) - list.get(i - 1);
                    int right = list.get(i + 1) - list.get(i);
                    ans += left * right;
                }
            }
            return ans;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
