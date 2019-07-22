package com.stackroute.pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringOccurrence {
    public String stringOccurrenceFinder(String input, String inputWord) {
        String sendBack = "";
        if (input != null && inputWord != null) {
            int count = 0;
            Pattern pattern = Pattern.compile(inputWord);
            Matcher matcher = pattern.matcher(input);
            boolean matches = matcher.matches();
            if (!matcher.find()) {
                sendBack = "Found:0 time";
            }
            while (matcher.find()) {
                count++;
                sendBack += "Founded at: " + matcher.start() + "-" + matcher.end() + " ";
            }
            return sendBack.trim();
        } else {
            return null;
        }
    }
}
