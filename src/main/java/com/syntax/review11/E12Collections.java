package com.syntax.review11;

import java.util.*;

public class E12Collections {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        //System.out.println(Collections.frequency(numbers,10));
        Collections.shuffle(numbers);
        System.out.println(numbers);
        int[] arr=new int[10];
        Arrays.fill(arr,50);
        System.out.println(Arrays.toString(arr));
    }
}
