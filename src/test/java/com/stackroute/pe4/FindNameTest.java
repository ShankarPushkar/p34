package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNameTest {
    FindName findName;
    @Before
    public void setUp() {
        findName=new FindName();
    }

    @After
    public void tearDown(){
        findName=null;
    }

    @Test
    public void givenAStringShouldReturnTrueMessage() {
        String input="This is Harry.";
        String actualResult=findName.nameFinder(input);
        String expectedResult="Is Harry here ? true";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenAStringShouldReturnFalseMessage() {
        String input="This is Pushkar.";
        String actualResult=findName.nameFinder(input);
        String expectedResult="Is Harry here ? false";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenANullStringShouldReturnNullMessage() {
        String input=null;
        String actualResult=findName.nameFinder(input);
        String expectedResult="String is Null";
        assertEquals(expectedResult,actualResult);
    }
}