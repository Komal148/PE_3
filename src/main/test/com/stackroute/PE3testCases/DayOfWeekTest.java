package com.stackroute.PE3testCases;

import com.stackroute.PE3.DayOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class DayOfWeekTest {

    DayOfWeek dayOfWeek;

    @Before
    public void setUp()
    {
        dayOfWeek=new DayOfWeek();
    }

    @After
    public void tearDown()
    {
        dayOfWeek=null;
    }

    @Test
    public void testDayOfWeekSuccess()
    {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeek.firstAndLastDay();
        assertEquals(expectedlValue,actualValue);
    }

    @Test
    public void testDayOfWeekFailure()
    {
        String expectedlValue="27/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeek.firstAndLastDay();
        assertNotEquals(expectedlValue,actualValue);
    }

    @Test
    public void testDayOfWeekNeutral()
    {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeek.firstAndLastDay();
        assertNotNull(expectedlValue,actualValue);
    }

}