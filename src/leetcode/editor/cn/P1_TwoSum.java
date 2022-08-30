/**
 * @Title: 两数之和 
 * @Author: Neo
 * @Date: 2022-07-20 20:08:38
 */
package leetcode.editor.cn;
public class P1_TwoSum{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P1_TwoSum().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			int x = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == x) {
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}
		}
		return arr;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
