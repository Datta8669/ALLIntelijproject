package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8FrequencyProgram {
    public static void main(String[] args) {

        //occurance of each character
        String str="dattapatil";
        Map<String, List<String>> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s));
        System.out.println(collect); //{p=[p], a=[a, a, a], t=[t, t, t], d=[d], i=[i], l=[l]}

        Map<String, Long> collect1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1); //{p=1, a=3, t=3, d=1, i=1, l=1}


        //duplicate using java 8  ..means greate than 1 occurace
        //above already we are getting map -> so just iterate it , convert it using entry set...etc
        List<String> collect2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect2);  //[a, t]

        //if interviewer said find unique element means.. just normal code change ...filter(x->x.getValue()==1)


        //first non repeat element..    .filter(x->x.getValue==1).findFirst().get.getKey();  //hashmap :no keeping insertion order(internally all check karto too) so use here linkedhashmap..so line by line check karel

        //first repeted sathi ..use  .filter(x->x.getValue>1).findFirst().get.getKey();

    }
}
