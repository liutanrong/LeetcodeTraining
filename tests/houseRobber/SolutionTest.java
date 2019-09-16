package houseRobber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution=new Solution();

    @Test
    public void rob00() {
        int[] a=new int[]{1};
        int result=solution.rob(a);
        Assert.assertEquals(1,result);
    }
    @Test
    public void rob0() {
        int[] a=new int[]{1,2};
        int result=solution.rob(a);
        Assert.assertEquals(2,result);
    }
    @Test
    public void rob3() {
        int[] a=new int[]{2,7,9};
        int result=solution.rob(a);
        Assert.assertEquals(11,result);
    }

    @Test
    public void rob4() {
        int[] a=new int[]{2,12,9};
        int result=solution.rob(a);
        Assert.assertEquals(12,result);
    }
    @Test
    public void rob() {
        int[] a=new int[]{1,2,3,1};
        int result=solution.rob(a);
        Assert.assertEquals(4,result);
    }

    @Test
    public void rob2() {
        int[] a=new int[]{2,7,9,3,1};
        int result=solution.rob(a);
        Assert.assertEquals(12,result);
    }
}