package com.stackroute.pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringOccurrence {
    public String stringOccurrenceFinder(String input, String inputWord) {
        if (input != null && inputWord != null) {
            int count = 0;
            Pattern pattern = Pattern.compile(inputWord);
            Matcher matcher = pattern.matcher(input);
            boolean matches = matcher.matches();
            while (matcher.find()) {
                count++;
            }
            return "Found:" + count + " time";
        } else {
            return null;
        }
    }
}
