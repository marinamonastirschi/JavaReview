package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E2Maps {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple",3);
        map.put("Kiwi",2);
        map.put("Orange",4);
        map.put("Mango",3);
        map.put("Apple",30);
        System.out.println(map);
        map.remove("Orange");
        System.out.println(map);
       Set<String> keys=map.keySet();
       map.values().removeIf(x->x>3);
        System.out.println(map);
        map.entrySet().removeIf(x->x.getKey().contains("a")&& x.getValue()>3);

    }
}