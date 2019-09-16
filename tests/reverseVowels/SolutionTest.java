package reverseVowels;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void reverseVowels() {
        String str = "hello";
        String expect = "holle";
        String actual = solution.reverseVowels(str);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void reverseVowels2() {
        String str = "leetcode";
        String expect = "leotcede";
        String actual = solution.reverseVowels(str);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void reverseVowels3() {
        String str = "aA";
        String expect = "Aa";
        String actual = solution.reverseVowels(str);
        Assert.assertEquals(expect, actual);
    }


    @Test
    public void reverseVowels4() {
        String str = "Anne, I vote more cars race Rome-to-Vienna.";
        String expect = "anne, i vote more cars race Rome-to-VIennA.";
        String actual = solution.reverseVowels(str);
        Assert.assertEquals(expect, actual);
    }
}