import com.bridgelabz.maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void whenGivenThreeInteger_shouldReturnMaximumInteger() {
        int first = 1;
        int second = 3;
        int third = 6;
        Maximum maximum = new Maximum();
        Integer result = maximum.getMaxNum(first, second, third);
        Assert.assertEquals(third, result.intValue());
    }

    @Test
    public void whenGivenMaximumNumAtFirstPosition_shouldReturnSameNumber() {
        int first = 8;
        int second = 1;
        int third = 3;
        Maximum maximum = new Maximum();
        Integer result = maximum.getMaxNum(first, second, third);
        Assert.assertEquals(first, result.intValue());
    }
    @Test
    public void whenGivenMaximumNumAtSecondPosition_shouldReturnSameNumber() {
        int first = 8;
        int second = 10;
        int third = 3;
        Maximum maximum = new Maximum();
        Integer result = maximum.getMaxNum(first, second, third);
        Assert.assertEquals(second, result.intValue());
    }
    @Test
    public void whenGivenMaximumNumAtThirdPosition_shouldReturnSameNumber() {
        int first = 8;
        int second = 10;
        int third = 30;
        Maximum maximum = new Maximum();
        Integer result = maximum.getMaxNum(first, second, third);
        Assert.assertEquals(third , result.intValue());
    }

    @Test
    public void whenGivenThreeFloat_shouldReturnMaximumFloat() {
        float first = 8.03f;
        float second = 10.00f;
        float third = 30.02f;
        Maximum maximum = new Maximum();
        Float result = maximum.getMaxFloatNum(first, second, third);
        Assert.assertEquals(third , result.floatValue(),0.0f);
    }

    @Test
    public void whenGivenMaximumFloatAtFirstPosition_shouldReturnSameNumber() {
        float first = 8.00f;
        float second = 1.00f;
        float third = 3.00f;
        Maximum maximum = new Maximum();
        Float result = maximum.getMaxFloatNum(first, second, third);
        Assert.assertEquals(first, result.floatValue(),0.0f);
    }
    @Test
    public void whenGivenMaximumFloatAtSecondPosition_shouldReturnSameNumber() {
        float first = 8.00f;
        float second = 10.00f;
        float third = 3.00f;
        Maximum maximum = new Maximum();
        Float result = maximum.getMaxFloatNum(first, second, third);
        Assert.assertEquals(second, result.floatValue(),0.0f);
    }

    @Test
    public void whenGivenMaximumFloatAtThirdPosition_shouldReturnSameNumber() {
        float first = 8.00f;
        float second = 10.00f;
        float third = 30.00f;
        Maximum maximum = new Maximum();
        Float result = maximum.getMaxFloatNum(first, second, third);
        Assert.assertEquals(third , result.intValue(),00.0f);
    }



}
