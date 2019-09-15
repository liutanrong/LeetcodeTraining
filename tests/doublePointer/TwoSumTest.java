package doublePointer;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum1() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expect = new int[]{1, 2};


        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(numbers, target);
        Assert.assertArrayEquals(expect, actual);
    }
}