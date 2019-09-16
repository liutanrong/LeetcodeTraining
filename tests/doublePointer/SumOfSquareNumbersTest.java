package doublePointer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfSquareNumbersTest {

    @Test
    public void judgeSquareSum() {
        int target = 5;
        boolean expect = true;
        SumOfSquareNumbers squareNumbers = new SumOfSquareNumbers();

        boolean actual = squareNumbers.judgeSquareSum(target);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void judgeSquareSum2() {
        int target = 3;
        boolean expect = false;
        SumOfSquareNumbers squareNumbers = new SumOfSquareNumbers();

        boolean actual = squareNumbers.judgeSquareSum(target);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void judgeSquareSum3() {
        int target = 2;
        boolean expect = true;
        SumOfSquareNumbers squareNumbers = new SumOfSquareNumbers();

        boolean actual = squareNumbers.judgeSquareSum(target);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void judgeSquareSum4() {
        int target = 4;
        boolean expect = true;
        SumOfSquareNumbers squareNumbers = new SumOfSquareNumbers();

        boolean actual = squareNumbers.judgeSquareSum(target);
        Assert.assertEquals(expect, actual);

        actual=squareNumbers.judgeSquareSum(1);
        Assert.assertEquals(true,actual);

        actual=squareNumbers.judgeSquareSum(0);
        Assert.assertEquals(true,actual);


        actual=squareNumbers.judgeSquareSum(6);
        Assert.assertEquals(false,actual);

        actual=squareNumbers.judgeSquareSum(7);
        Assert.assertEquals(false,actual);

        actual=squareNumbers.judgeSquareSum(8);
        Assert.assertEquals(true,actual);
    }
}