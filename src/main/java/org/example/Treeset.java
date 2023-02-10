package org.example;

import java.util.TreeSet;
import java.util.logging.*;

public class Treeset {
    public static void main(String[] arg){
        TreeSet<String> t = new TreeSet<>();
        Logger l = Logger.getLogger("com.api.jar");
        t.add("Mani");
        t.add("Nithish");
        t.add("Kumar");
        t.add("vijay");
        l.log(Level.INFO, () ->"Size of Hashset:" + t.size());
        l.log(Level.INFO, () -> String.valueOf(t));
        t.remove("Kumar");
        l.log(Level.INFO, () -> String.valueOf(t));

    }
}
