package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurrenceTest {
    private CharacterOccurrence characterOccurrence;

    @Before
    public void setUp() {
        characterOccurrence=new CharacterOccurrence();
    }

    @After
    public void tearDown() {
        characterOccurrence=null;
    }
    @Test
    public void givenAStringShouldReturnAOccurrence(){
        String input="Hello This is pushkar here";
        int actualResult=characterOccurrence.aCharacterCounter(input,"s");
        assertEquals(3,actualResult);
    }
    @Test
    public void givenAStringShouldReturnZero(){
        String input="Hello There";
        int actualResult=characterOccurrence.aCharacterCounter(input,"a");
        assertEquals(0,actualResult);

    }
    @Test(expected = NullPointerException.class)
    public void givenANullStringShouldNullPointerException(){
        int actualResult=characterOccurrence.aCharacterCounter(null,"z");
        assertEquals(0,actualResult);
    }
}