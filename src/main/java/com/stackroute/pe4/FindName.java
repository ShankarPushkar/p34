package com.stackroute.pe4;

public class FindName {
    public String nameFinder(String input) {
        String sendBack = new String();
        if (input != null) {
            boolean flag = input.contains("Harry");
            sendBack = "Is Harry here ? " + flag;

        } else {
            sendBack = "String is Null";
        }
        return sendBack;
    }
}
