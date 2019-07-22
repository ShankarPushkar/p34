package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOccurrenceTest {
    private StringOccurrence stringOccurrence;
    @Before
    public void setUp(){
        stringOccurrence=new StringOccurrence();
    }

    @After
    public void tearDown(){
        stringOccurrence=null;
    }

    @Test
    public void givenAStringShouldReturnWordOccurrence() {
        String input="She sells seashells by the seashore";
        String inputWord="se";
        String actualResult=stringOccurrence.stringOccurrenceFinder(input,inputWord);
        String expectedResult="Found at: 4 - 6";
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenANullStringShouldReturnNull() {
        String input=null;
        String inputWord="se";
        String actualResult=stringOccurrence.stringOccurrenceFinder(input,inputWord);
        String expectedResult=null;
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenAStringShouldReturnNotOccurred() {
        String input="She sells seashells by the seashore";
        String inputWord="zm";
        String actualResult=stringOccurrence.stringOccurrenceFinder(input,inputWord);
        String expectedResult="Found at: Not Found";
        assertEquals(expectedResult,actualResult);

    }
}