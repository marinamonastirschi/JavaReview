package com.syntax.review11;

import java.util.HashMap;
import java.util.Map;

public class E14Maps {
    public static void main(String[] args) {
        Map<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2.5);
        fruits.put("Banana",2.0);
        fruits.put("Kiwi",3.2);
        fruits.put("Orange",4.0);
        fruits.put("Mango",5.1);
        System.out.println(fruits);
        fruits.remove("Mango");
        System.out.println(fruits.containsKey("Kiwi"));
        System.out.println(fruits.containsValue(3.2));
        fruits.replace("Kiwi",3.8);
        System.out.println(fruits);

    }
}
