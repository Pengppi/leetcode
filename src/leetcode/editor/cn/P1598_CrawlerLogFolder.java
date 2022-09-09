/**
 * @Title: 文件夹操作日志搜集器
 * @Author: Neo
 * @Date: 2022-09-09 13:19:12
 */
package leetcode.editor.cn;

public class P1598_CrawlerLogFolder {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1598_CrawlerLogFolder().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minOperations(String[] logs) {
            int d = 0;
            for (String log : logs) {
                if (log.equals("../")) {
                    d = Math.max(0, d - 1);
                } else if (!log.equals("./")) {
                    d++;
                }
            }
            return d;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
