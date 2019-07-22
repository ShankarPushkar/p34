package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordSorting {
    public String wordSorter(String input) {
        if(input!=null){
        List<String> sorter = new ArrayList();
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            sorter.add(inputArray[i]);
            //System.out.println(sorter);
        }
        Collections.sort(sorter);
        StringBuilder sb = new StringBuilder();
        for (String s : sorter) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString().trim();
        }else {
        return null;}
    }

}
