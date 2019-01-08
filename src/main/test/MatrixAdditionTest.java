import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MatrixAdditionTest {

    MatrixAddition matrixAddition;
    @Before
    public void setUp()
    {
        matrixAddition=new MatrixAddition();
    }

    @After
    public void tearDown()
    {
        matrixAddition=null;
    }

    @Test
    public void testmatrixAdditionSuccess()
    {
        int[][] firstMatrix ={{1,2},{3,4},{5,6}};
        int[][] secondMatrix={{9,8},{7,6},{5,4}};
        int[][] resultMatrix={{10,10},{10,10},{10,10}};

        assertEquals(resultMatrix, matrixAddition.addTwoMatrix(firstMatrix,secondMatrix,3,2));
    }

    @Test
    public void testMatrixAdditionFailure()
    {
        int[][] firstMatrix ={{1,2},{3,4},{5,6}};
        int[][] secondMatrix={{9,8},{7,6},{5,4}};
        int[][] resultMatrix={{10,10},{10,10},{10,10}};

        assertNotEquals(resultMatrix, matrixAddition.addTwoMatrix(firstMatrix,secondMatrix,3,2));
    }

    @Test(expected = ArithmeticException.class)
    public void testMatrixAdditionNeutral()
    {
        int[][] firstMatrix ={{1/0,2},{3,4},{5,6}};
        int[][] secondMatrix={{9,8},{7,6},{5,4}};

    }
}