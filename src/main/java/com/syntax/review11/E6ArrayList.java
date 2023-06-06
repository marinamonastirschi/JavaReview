package com.syntax.review11;

import java.util.ArrayList;
import java.util.LinkedList;

public class E6ArrayList {
    public static void main(String[] args) {
        LinkedList<String> arrayList = new LinkedList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");

        ArrayList<String> feeDefaulter= new ArrayList<>();
        feeDefaulter.add("Axel");
        feeDefaulter.add("Leandro");
        feeDefaulter.add("Farwa");
        feeDefaulter.add("Adam");

        arrayList.removeAll(feeDefaulter);
        System.out.println(arrayList);






    }
}