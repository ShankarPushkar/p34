package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordSorting {
    public String wordSorter(String input) {
        if (input != null) {
            List<String> sorter = new ArrayList();
            String[] inputArray = input.split(" ");
            for (int i = 0; i < inputArray.length; i++) {
                sorter.add(inputArray[i]);
            }
            Collections.sort(sorter);
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : sorter) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            }
            return stringBuilder.toString().trim();
        } else {

            return null;
        }
    }

}
