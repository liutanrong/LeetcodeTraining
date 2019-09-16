package doublePointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 * <p>
 * 示例1:
 * <p>
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *  
 * <p>
 * 示例2:
 * <p>
 * 输入: 3
 * 输出: False
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-square-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {


        int j = (int) Math.sqrt(c);
        int i = 0;
        while (i <= j) {
            int total = i * i + j * j;
            if (total > c) {
                j = j - 1;
            } else if (total < c) {
                i = i + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
