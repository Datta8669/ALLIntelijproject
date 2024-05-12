package com.col;

import java.util.HashMap;

public class CountCharacterMap {
    public static void main(String[] args) {
        String stt="1234r2fw!@!#@!4";
        System.out.println( stt.replaceAll("[A-Za-z0-9]", " "));    // regular expression.... special character..

        String st=" i am a boy";
        System.out.println(st.replace(" ", "_"));  //replace with "_"......

        String str = "aabbccdde";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char cc=str.charAt(i);
            if (mp.containsKey(cc)) {
                mp.put(cc, mp.get(cc) + 1);
            }else{
                mp.put(cc, 1);
            }
        }
        System.out.println(mp);
    }

}