package validPalindrome2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void validPalindrome() {
        String str = "aba";
        boolean result = solution.validPalindrome(str);
        Assert.assertTrue(result);
    }

    @Test
    public void validPalindrome2() {
        String str = "abca";
        boolean result = solution.validPalindrome(str);
        Assert.assertTrue(result);
    }

    @Test
    public void validPalindrome3() {
        String str = "aeccba";
        boolean result = solution.validPalindrome(str);
        Assert.assertFalse(result);
    }

    @Test
    public void validPalindrome4() {
        String str = "cbbcc";
        boolean result = solution.validPalindrome(str);
        Assert.assertTrue(result);
    }
}