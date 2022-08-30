/**
 * @Title: 求解方程
 * @Author: Neo
 * @Date: 2022-08-10 18:21:23
 */
package leetcode.editor.cn;

public class P640_SolveTheEquation {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P640_SolveTheEquation().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String solveEquation(String equation) {
            int x = 0, num = 0, n = equation.length();
            char[] cs = equation.toCharArray();
            int op = 1;
            for (int i = 0; i < n; i++) {
                if (cs[i] == '+') {
                    op = 1;
                } else if (cs[i] == '-') {
                    op = -1;
                } else if (cs[i] == '=') {
                    x *= -1;
                    num *= -1;
                    op = 1;
                } else {
                    int j = i;
                    while (j < n && cs[j] != '+' && cs[j] != '-' && cs[j] != '=') {
                        j++;
                    }
                    if (cs[j - 1] == 'x') {
                        x += (i < j - 1 ? Integer.parseInt(equation.substring(i, j - 1)) : 1) * op;
                    } else {
                        num += Integer.parseInt(equation.substring(i, j)) * op;
                    }
                    i = j - 1;
                }
            }
            if (x == 0) {
                return num == 0 ? "Infinite solutions" : "No solution";
            } else {
                return "x=" + (num / -x);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
