package com.stackroute.pe3;

public class CharacterOccurrence {
    public int aCharacterCounter(String input, String character) {
        int sendBack = 0;
        if (input == null) {
            return sendBack;
        } else {
            int count = input.length() - input.replaceAll(character, "").length();
            sendBack = count;
        }
        return sendBack;
    }
}
