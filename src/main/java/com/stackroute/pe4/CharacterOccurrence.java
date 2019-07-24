package com.stackroute.pe4;

public class CharacterOccurrence {
    public int aCharacterCounter(String input, String character) {
        int sendBack = 0;

            int count = input.length() - input.replaceAll(character, "").length();
            sendBack = count;

        return sendBack;
    }
}
