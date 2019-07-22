package com.stackroute.pe3;

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
        String[] actualResult=wordSorting.wordSorter(input);
        String[] expectedResult={"Hello","Hi","There"};
        assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void givenANullStringShouldReturnNull(){
        String input=null;
        String[] actualResult=wordSorting.wordSorter(input);
        String[] expectedResult=null;
        assertArrayEquals(expectedResult,actualResult);


    }
}