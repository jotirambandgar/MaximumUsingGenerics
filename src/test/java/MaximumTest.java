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
}
