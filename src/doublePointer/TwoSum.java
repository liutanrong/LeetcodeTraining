package doublePointer;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {


    public int[] twoSum(int[] numbers, int target) {

        int[] indexs = new int[2];
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hash.containsKey(numbers[i])) {
                indexs[0] = hash.get(numbers[i]);
                indexs[1] = i;
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target - numbers[i], i);
        }


        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            for (int j = numbers.length - 1; j >= 0; j--) {
                int currentJNum = numbers[j];
                if (currentNum + currentJNum == target) {
                    int[] array = new int[]{i, j};
                    return array;
                }
            }
        }
        return new int[]{};
    }
}
