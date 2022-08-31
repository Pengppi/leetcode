/**
 * @Title: 至少有 K 个重复字符的最长子串
 * @Author: Neo
 * @Date: 2022-08-31 11:06:12
 */
package leetcode.editor.cn;

public class P395_LongestSubstringWithAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P395_LongestSubstringWithAtLeastKRepeatingCharacters().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubstring(String str, int k) {
            int n = str.length();
            return dfs(str, 0, n - 1, k);
        }

        private int dfs(String str, int l, int r, int k) {
            int cnt[] = new int[26];
            for (int i = l; i <= r; i++) {
                cnt[str.charAt(i) - 'a']++;
            }
            char split = 0;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] > 0 && cnt[i] < k) {
                    split = (char) (i + 'a');
                    break;
                }
            }
            if (split == 0) {
                return r - l + 1;
            }
            int i = l, ans = 0;
            while (i < r) {
                while (i <= r && str.charAt(i) == split) {
                    i++;
                }
                if (i > r) {
                    break;
                }
                int start = i;
                while (i <= r && str.charAt(i) != split) {
                    i++;
                }
                ans = Math.max(ans, dfs(str, start, i - 1, k));
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
