package org.example;

import java.util.HashSet;
import java.util.logging.*;

public class Hashset{
    public static void main(String[] args) {

        //creating a hashset
        HashSet<String> h = new HashSet<>();
        Logger l = Logger.getLogger("com.api.jar");

        h.add("Mani");
        h.add("Nithish");
        h.add("Kumar");
        h.add("vijay");
        l.log(Level.INFO, () ->"Size of Hashset:" + h.size());
        l.log(Level.INFO, () -> String.valueOf(h));
        h.remove("Kumar");
        l.log(Level.INFO, () -> String.valueOf(h));
    }
}
