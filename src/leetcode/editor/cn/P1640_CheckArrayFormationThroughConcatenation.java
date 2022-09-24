/**
 * @Title: 能否连接形成数组
 * @Author: Neo
 * @Date: 2022-09-22 15:59:16
 */
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class P1640_CheckArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1640_CheckArrayFormationThroughConcatenation().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canFormArray(int[] arr, int[][] pieces) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < pieces.length; i++) {
                map.put(pieces[i][0], i);
            }
            for (int i = 0; i < arr.length;) {
                if (!map.containsKey(arr[i])) {
                    return false;
                }
                int index = map.get(arr[i]);
                int len = pieces[index].length;
                for (int j = 0; j < len; j++) {
                    if (arr[i + j] != pieces[index][j]) {
                        return false;
                    }
                }
                i += len;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
