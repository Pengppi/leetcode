/**
 * @Title: 两个相同字符之间的最长子字符串
 * @Author: Neo
 * @Date: 2022-09-17 17:23:02
 */
package leetcode.editor.cn;

public class P1624_LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1624_LargestSubstringBetweenTwoEqualCharacters().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxLengthBetweenEqualCharacters(String s) {
            int ans = -1;
			int n=s.length();
			for (int i = 0; i < n-1; i++) {
				char c=s.charAt(i);
				int j=s.lastIndexOf(c);
				ans=Math.max(ans,j-i-1);
			}
			return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
