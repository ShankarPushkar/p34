package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurrenceTest {
    private CharacterOccurrence characterOccurrence;

    @Before
    public void setUp() {
        //Arrange
        characterOccurrence = new CharacterOccurrence();
    }

    @After
    public void tearDown() {
        characterOccurrence = null;
    }

    /*When we are giving an array, it should return occurrence of
    a given character
    */
    @Test
    public void givenAStringShouldReturnAOccurrence() {
        //Act
        String input = "Hello This is pushkar here";
        int actualResult = characterOccurrence.aCharacterCounter(input, "s");
        //Assert
        assertEquals(3, actualResult);
    }

    /*When we are giving an array, it should return occurrence of
    a given character,if it is not there it should return zero
    */
    @Test
    public void givenAStringShouldReturnZero() {
        //Act
        String input = "Hello There";
        int actualResult = characterOccurrence.aCharacterCounter(input, "a");
        //Assert
        assertEquals(0, actualResult);
    }

    /*
    When we are giving a null array, it should throw null pointer exception
    */
    @Test(expected = NullPointerException.class)
    public void givenANullStringShouldNullPointerException() {
        //Act
        int actualResult = characterOccurrence.aCharacterCounter(null, "z");
        //Assert
        assertEquals(0, actualResult);
    }
}