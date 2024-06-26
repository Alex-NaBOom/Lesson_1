package src.test.java;
import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.java.org.olenskii.Factorial;

public class FactorialTest {
    @Test
    public void testCalculateFactorial_Zero() {
        Assert.assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    public void testCalculateFactorial_Positive() {
        Assert.assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorial_Negative() {
        Factorial.calculateFactorial(-1);
    }

}
