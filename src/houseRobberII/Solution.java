package houseRobberII;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,2]
 * 输出: 3
 * 解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 * 示例 2:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int[] destArr = new int[nums.length - 1];
        System.arraycopy(nums, 1, destArr, 0, nums.length - 1);
        int jumpFirst = rob0(destArr);

        System.arraycopy(nums, 0, destArr, 0, nums.length - 1);
        int jumpLast = rob0(destArr);

        return Math.max(jumpFirst, jumpLast);
    }

    public int rob0(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int length = nums.length;

        int lastMax = 0;
        int lastLastMax = 0;
        int current = 0;
        for (int i = 0; i < length; i++) {
            if (lastLastMax + nums[i] > lastMax) {
                current = lastLastMax + nums[i];
                lastLastMax = lastMax;
                lastMax = current;

            } else {
                current = lastMax;
                lastLastMax = current;
            }

        }
        return current;
    }
}
