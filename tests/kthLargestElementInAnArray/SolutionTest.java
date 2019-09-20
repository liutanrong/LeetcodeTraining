package kthLargestElementInAnArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findKthLargest() {
        int[] nums=new int[]{3,2,1,5,6,4};
        int k=2;
        Solution solution=new Solution();
        int result=solution.findKthLargest(nums,k);
        Assert.assertEquals(5,result);
    }
    @Test
    public void findKthLargest1() {
        int[] nums=new int[]{3,2,3,1,2,4,5,5,6};
        int k=4;
        Solution solution=new Solution();
        int result=solution.findKthLargest(nums,k);
        Assert.assertEquals(4,result);
    }
}