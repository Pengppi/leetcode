/**
 * @Title: 大礼包
 * @Author: Neo
 * @Date: 2022-09-01 11:07:06
 */
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P638_ShoppingOffers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P638_ShoppingOffers().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Map<List<Integer>, Integer> map = new HashMap<>();

        public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
            int n = price.size();
            for (int i = special.size() - 1; i >= 0; i--) {
                List<Integer> haves = special.get(i);
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += needs.get(j) * price.get(j);
                    if (haves.get(j) > needs.get(j)) {
                        special.remove(i);
                        break;
                    }
                    if (j == n - 1 && haves.get(n) > sum) {
                        special.remove(i);
                    }
                }
            }
            return dfs(price, special, needs);
        }

        private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
            if (map.containsKey(needs)) {
                return map.get(needs);
            } else {
                int n = price.size();
                int minPrice = 0;
                for (int i = 0; i < n; i++) {
                    minPrice += price.get(i) * needs.get(i);
                }
                for (List<Integer> list : special) {
                    int sPrice = list.get(n);
                    List<Integer> nextNeeds = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        if (list.get(i) > needs.get(i)) {
                            break;
                        }
                        nextNeeds.add(needs.get(i) - list.get(i));
                    }
                    if (nextNeeds.size() == n) {
                        minPrice = Math.min(minPrice, sPrice + dfs(price, special, nextNeeds));
                    }
                }
                map.put(needs, minPrice);
            }
            return map.get(needs);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
