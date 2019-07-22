package com.stackroute.pe4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordTranspose {
    public String wordTransposer(String input) {
        if (input != null) {
            String[] getWords = input.split(" ");
            String sendBack = new String();
            for (int i = 0; i < getWords.length; i++) {
                StringBuilder temporary = new StringBuilder();
                temporary.append(getWords[i]);
                temporary.reverse();
                getWords[i] = temporary.toString();
//            System.out.println(getWords[i]);
            }
            for (int i = 0; i < getWords.length; i++) {
                sendBack = sendBack.concat(getWords[i] + " ");

            }
            return sendBack.trim();
        } else {
            return null;
        }

//        return Arrays.toString(getWords);
    }
}
