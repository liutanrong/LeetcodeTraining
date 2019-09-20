package validPalindrome2;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 * <p>
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public boolean validPalindrome(String s) {

        int length = s.length();
        for (int i = 0, j = length - 1; i < length && j >= i;
             i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindRome(s.substring(0, i) + s.substring(i + 1)) || isPalindRome(s.substring(0, j) + s.substring(j + 1));

            }

        }
        return true;
    }

    private boolean isPalindRome(String str) {
        int length = str.length();
        for (int i = 0, j = length - 1; i < str.length() && j >= i; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}