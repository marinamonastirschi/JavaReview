package com.syntax.review7;

import java.util.Arrays;

public class JavaMethods {
    String [] arr(String sentence){
       return sentence.split(" ");
    }

    public static void main(String[] args) {
        JavaMethods obj=new JavaMethods();
        String [] sentence=obj.arr("Java is easy");
        for(String str:sentence){
            System.out.println(str);
        }
    }
}
