package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> h = new HashMap<>();
        Logger l = Logger.getLogger("com.api.jar");
        h.put(1, "Mani");
        h.put(2, "Nithish");
        h.put(3, "Kumar");
        h.put(4, "vijay");
        l.log(Level.INFO, () -> String.valueOf(h));
        l.log(Level.INFO,()->"Keys : " + h.keySet());
        l.log(Level.INFO,()->"Values : " + h.values());
        l.log(Level.INFO,()-> "Key-Value mapping: " + h.entrySet());
        h.replace(2, "Nithish", "NITHISH");
        for(Map.Entry<Integer, String> m: h.entrySet()){
            l.log(Level.INFO,()->m.getKey() + " " + m.getValue());
        }
        l.log(Level.INFO,()->h.get(2));
        h.remove(4);
        l.log(Level.INFO,()-> String.valueOf(h));
    }
}
