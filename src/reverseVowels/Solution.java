package reverseVowels;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * <p>
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * aoeiuv
 */
class Solution {
    static Set<Character> characterSet = new HashSet<>();

    static {
        characterSet.add('a');
        characterSet.add('o');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('u');


        characterSet.add('A');
        characterSet.add('O');
        characterSet.add('E');
        characterSet.add('I');
        characterSet.add('U');
    }

    public String reverseVowels(String s) {
        int length = s.length();

        int j = length - 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            if (!characterSet.contains(chars[i])) {
                continue;
            }
            for (; j >= i; j--) {
                if (characterSet.contains(chars[j])) {
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                    j = j - 1;
                    break;
                }

            }
        }
        return new String(chars);
    }
}