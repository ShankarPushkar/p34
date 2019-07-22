package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacementTest {
    private CharacterReplacement characterReplacement;

    @Before
    public void setUp() {
        characterReplacement=new CharacterReplacement();
    }

    @After
    public void tearDown() {
        characterReplacement=null;
    }

    @Test
    public void givenAStringShouldReplaceCharacter(){
        String input="daily dry";
        String actualResult=characterReplacement.characterReplacer(input);
        String expectedResult="faity fry";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenANullStringShouldReturnNull(){
        String input=null;
        String actualResult=characterReplacement.characterReplacer(input);
        String expectedResult=null;
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenAStringShouldReturnSameString(){
        String input="aiy ry";
        String actualResult=characterReplacement.characterReplacer(input);
        String expectedResult="aiy ry";
        assertEquals(expectedResult,actualResult);

    }
}