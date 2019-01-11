package com.stackroute.PE3testCases;

import com.stackroute.PE3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StudentMarksTest {

    StudentMarks studentMarks;

    @Before
    public void setUp()
    {

        // setup methods runs, before every test case runs
        // This method is used to initialize the required variables
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown()
    {
        // teardown method runs, after every test case run
        // This method is to clear the initialized variables
        studentMarks = null;
    }

    /*
    This method checks for correct Input and output
    Grade is between 1 to 100
    */

    @Test
    public void testStudentMarksSuccess()
    {

        int studentArray[]={100,55,60,45};

        String actualValue =studentMarks.computeStudentGrade(studentArray,4);
        String expectedValue="Grade is between 1 to 100";
        assertEquals(expectedValue,actualValue);


    }

    /*
    This method checks for number greater than 100 as Input and output
    Grade is more than 100 at index i
    */
    @Test
    public void testStudentMarksFailure()
    {
        int studentArray[]={100,55,160,45};
        int numberOfStudents=4;
        String actualValue =studentMarks.computeStudentGrade(studentArray,4);
        String expectedValue="Grade is more than 100 at index 2";
        assertEquals(expectedValue,actualValue);

    }

    /*
    This method checks for negative numbers as Input and output
    Entered negative value at index i
    */
    @Test
    public void testStudentMarksNegative()
    {
        int[] negativeStudentArray={40,-4,56,89};
        int numberOfStudents=4;
        String actualValue =studentMarks.computeStudentGrade(negativeStudentArray,4);
        String expectedValue="Error! entered negative Value at index 1";
        assertEquals(expectedValue,actualValue);
    }

    /*
    This method checks for empty array as Input and output
    You didn't enter any Value.
    */
    @Test
    public void testStudentMarksEmpty()
    {

        int emptyStudentArray[]={};
        int numberOfStudents=0;
        String actualValue =studentMarks.computeStudentGrade(emptyStudentArray,0);
        String expectedValue="You didn't enter any  Value";
        assertEquals(expectedValue,actualValue);
    }

    /*
    This method checks for number that has arithmetic exception as Input and
    throws an error.
    */
    @Test(expected = ArithmeticException.class)
    public void testInvalidValue()
    {
                int[] errorStudentArray = {40 / 0, 98, 56, 89};

    }

}