package com.java8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiNthHighestSalary {

//this no passing in get method is hard code.. we need to write this in a method..and pass dynamically..

    //public static Map.Entry<String, Integer> getNthHighest(int num, Map<String, Integer> mp){

    //}
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("aa", 13);
        mp.put("wa", 12);
        mp.put("fa", 11);
        mp.put("aga", 10);
//inbuilt method is present..compare by key or compare by value..
        //at last u can get whatever u want
        Map.Entry<String, Integer> lowest = mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(1);
        System.out.println(lowest);//but it is giving in ascending order..

        Map.Entry<String, Integer> high = mp.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
        System.out.println(high);  //Collections.reverseOrder();

        //if multiple value with same , 1st we will do grouping by values..
        Map<Integer, List<Map.Entry<String, Integer>>>    collect =  mp.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue));
        //System.out.println(collect);


    }
}