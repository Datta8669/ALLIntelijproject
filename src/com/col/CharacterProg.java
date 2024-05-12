package com.col;
import java.util.*;
import java.io.*;

public class CharacterProg {
    public static void main(String[] args) {
        String str  ="abcdefgh";
        String str2  ="abcd@#$efghb"; //split with character , using  regex...
        int sy=str.indexOf('b' ,str.indexOf('b')+1 );
        System.out.println(sy);   // here we got index of b......
            String tt[]=str2.split("@");  //agar koi special character  hai to ye use karna ...nahi to substring use karna...
        for(String  c:tt)  {
            System.out.println(c);  //   we splitted  with @....
        }
        //want space between d  &  e

         String st=str.substring(0, 4);   //string la split karne
         String st2=str.substring(4, str.length());   // upto where we want..........
       // System.out.println(st);
       // System.out.println(st2);
       // System.out.println(st+ "  == " +st2);

        String ss=" i am indian who is ";
        String se[]=ss.split("\\s");
        for(String  c:se)  {
          //  System.out.println(c);  //   we split with space....
        }




       //i fi want to play with single  word in string
        char ch[]=str.toCharArray();
        for(char c:ch){
            if(c=='d') {
                System.out.println(">>>inside >>>>");
            }}

    }
}
