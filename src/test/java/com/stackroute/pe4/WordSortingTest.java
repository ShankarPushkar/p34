package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSortingTest {
    private WordSorting wordSorting;
    @Before
    public void setUp(){
        wordSorting=new WordSorting();
    }

    @After
    public void tearDown() {
        wordSorting=null;
    }

    @Test
    public void givenAStringShoulReturnWordsInOrder(){
        String input="Hello Hi There";
        String actualResult=wordSorting.wordSorter(input);
        String expectedResult="Hello Hi There";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenANullStringShouldReturnNull(){
        String input=null;
        String actualResult=wordSorting.wordSorter(input);
        String expectedResult=null;
        assertEquals(expectedResult,actualResult);


    }
}