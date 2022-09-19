/**
 * @Title: 按照频率将数组升序排序
 * @Author: Neo
 * @Date: 2022-09-19 14:04:51
 */
package leetcode.editor.cn;

import java.util.*;

public class P1636_SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1636_SortArrayByIncreasingFrequency().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                list.add(nums[i]);
            }
            Collections.sort(list, (a, b) -> (map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b)));
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
