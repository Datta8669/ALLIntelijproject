package com.col;

import java.util.HashMap;

public class DuplicateAndFrequency {
    public static void main(String[] args) {
        //2 way   hashmap,   normal 2 loop using.....
//count , duplicate......
        String str="aabbcc";
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch, i);
            }
        }
        System.out.println(mp);
    }
}
