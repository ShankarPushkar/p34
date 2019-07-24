package com.stackroute.pe4;

public class CharacterReplacement {
    public String characterReplacer(String input) {
        String sendBack = null;
        if (input != null) {
            sendBack = input.replaceAll("d", "f");
            sendBack = sendBack.replaceAll("l", "t");
        }
        return sendBack;
    }
}
