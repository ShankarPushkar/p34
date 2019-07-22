package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordTransposeTest {
    WordTranspose wordTranspose;
    @Before
    public void setUp() {
        wordTranspose=new WordTranspose();
    }

    @After
    public void tearDown() {
        wordTranspose=null;
    }

    @Test
    public void givenAStringShouldReturnTransposeOfWords() {
        String input="a quick brown fox jumps over the lazy dog";
        String actualResult=wordTranspose.wordTransposer(input);
        String expectedResult="a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenANullStringShouldReturnNull(){
        String input=null;
        String actualResult=wordTranspose.wordTransposer(input);
        String expectedResult=null;
        assertEquals(expectedResult,actualResult);
    }
}