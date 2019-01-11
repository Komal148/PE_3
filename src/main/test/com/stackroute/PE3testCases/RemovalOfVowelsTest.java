package com.stackroute.PE3testCases;

import com.stackroute.PE3.RemovalOfVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class RemovalOfVowelsTest {

    RemovalOfVowels removalOfVowels;
    @Before
    public void setUp()
    {
        removalOfVowels=new RemovalOfVowels();
    }

    @After
    public void tearDown()
    {
        removalOfVowels=null;
    }

    @Test
    public void testRemovalOfVowelsSuccess()
    {
        List<String> string=new ArrayList<>();
        string.add("India");
        string.add("United States");
        string.add("Germany");
        string.add("Egypt");
        string.add("czechoslovakia");

        List<String> actualString=removalOfVowels.removeVowels(string);
        string.clear();
        string.add("Ind");
        string.add("Untd Stts");
        string.add("Grmny");
        string.add("Egypt");
        string.add("czchslvk");
        List<String> expectedString = string;

        assertEquals(expectedString,actualString);

    }

    @Test
    public void testRemovalOfVowelFailure()
    {
        List<String> string=new ArrayList<>();
        string.add("India");
        string.add("United States");
        string.add("Germany");
        string.add("Egypt");
        string.add("czechoslovakia");

        List<String> actualString=removalOfVowels.removeVowels(string);
        string.clear();
        string.add("India");
        string.add("Untd Stts");
        string.add("Grmny");
        string.add("Egypt");
        string.add("czchslvk");
        List<String> expectedString = string;

        assertNotEquals(expectedString,actualString);

    }

    @Test
    public void testRemovalOfVowelNeutral()
    {
        List<String> string=new ArrayList<>();

        List<String> actualString=removalOfVowels.removeVowels(string);

        assertNull(null,actualString);

    }

}