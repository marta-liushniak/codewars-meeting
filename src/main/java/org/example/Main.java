package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;"
                + "Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }

    public static String meeting(String s) {
        String[] guests = s.toUpperCase().split(";");
        for (int i = 0; i < guests.length; i++) {
            int index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index + 1) + ", "
                    + guests[i].substring(0, index) + ")";
        }
        Arrays.sort(guests);
        return String.join("",guests);
    }
}
