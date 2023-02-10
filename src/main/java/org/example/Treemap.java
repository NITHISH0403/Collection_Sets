package org.example;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.*;

public class Treemap {
    public static void main(String[] args){
        TreeMap<Integer, String> t = new TreeMap<>();
        Logger l = Logger.getLogger("com.api.jar");
        t.put(11, "Mani");
        t.put(2, "Nithish");
        t.put(43, "Kumar");
        t.put(34, "vijay");
        l.log(Level.INFO, () -> String.valueOf(t));
        l.log(Level.INFO, () -> String.valueOf(t.firstKey()));
        l.log(Level.INFO, () -> String.valueOf(t.lastKey()));
        l.log(Level.INFO, () -> String.valueOf(t.lastEntry()));
        t.replace(2, "Nithish", "NITHISH");
        for(Map.Entry m: t.entrySet()){
            l.log(Level.INFO,()->m.getKey() + " " + m.getValue());
        }
        l.log(Level.INFO,()->t.get(2));
        t.remove(43);
        l.log(Level.INFO,()-> String.valueOf(t));
    }
}
