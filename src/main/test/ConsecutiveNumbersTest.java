import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ConsecutiveNumbersTest {
     ConsecutiveNumbers consecutiveNumbers;

     @Before
    public void setUp()
     {
         consecutiveNumbers=new ConsecutiveNumbers();
     }

     @After
    public void tearDown()
     {
         consecutiveNumbers=null;
     }
     @Test
     public void testConsecutiveNumberSuccess()
     {
        String consecutiveNum="98,97,96,95,94,93";
        int actualValue = consecutiveNumbers.checkConsecutiveNumber(consecutiveNum);
        int expectedValue=1;
        assertEquals(expectedValue,actualValue);

     }

     @Test
     public void testConsecutiveNumberFailure()
     {
         String consecutiveNum="98,96,96,95,94,93";
         int actualValue = consecutiveNumbers.checkConsecutiveNumber(consecutiveNum);
         int expectedValue=0;
         assertEquals(expectedValue,actualValue);

     }

    @Test
    public void testConsecutiveNumberNeutral()
    {
        String consecutiveNum=null;
        int actualValue = consecutiveNumbers.checkConsecutiveNumber(consecutiveNum);
        int expectedValue=-1;
        assertEquals(expectedValue,actualValue);

    }
}