package climbingStairs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void climbStairs() {
        int result = solution.climbStairs(2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void climbStairs3() {
        int result = solution.climbStairs(3);
        Assert.assertEquals(3, result);
    }
    @Test
    public void climbStairs4() {
        int result = solution.climbStairs(4);
        Assert.assertEquals(5, result);
    }
    @Test
    public void climbStairs5() {
        int result = solution.climbStairs(5);
        Assert.assertEquals(8, result);
    }
    @Test
    public void climbStairs6() {
        int result = solution.climbStairs(44);
        Assert.assertEquals(8, result);
    }
}