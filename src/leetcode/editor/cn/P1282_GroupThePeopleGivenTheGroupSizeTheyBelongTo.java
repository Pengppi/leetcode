/**
 * @Title: 用户分组
 * @Author: Neo
 * @Date: 2022-08-12 22:28:50
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < groupSizes.length; i++) {
                List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
                list.add(i);
                map.put(groupSizes[i], list);
            }
            List<List<Integer>> ans = new ArrayList<>();
            for (int k : map.keySet()) {
                List<Integer> list = map.get(k);
                List<Integer> cur = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    cur.add(list.get(i));
                    if (cur.size() == k) {
                        ans.add(cur);
                        cur = new ArrayList<>();
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
