package com.syntax.review12;

import java.util.Map;
import java.util.TreeMap;

public class E7InterviewQuestion {
    public static void main(String[] args) {
// print the numbers with their count (how many times they appeared in the array)
        int[] arr={10,20,10,30,40,50,20,30,70,80,70};
        Map<Integer, Integer> map= new TreeMap<>();
      for(int num:arr){
          if(map.get(num)==null){
             map.put(num,1);
          }else
          {
              int count= map.get(num) +1;
              map.put(num,count);
          }
      }
    }
}
