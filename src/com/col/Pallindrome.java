package com.col;

public class Pallindrome {
    public static void main(String[] args) {
        //to check pallindrome
        String str="abc";
        //any other logic to reverse
          String rev = "";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
         // rev=rev+ch;  //here we are  not getting reverse   ???why
          rev=ch+rev;  //here we are getting reverse  ??? why
        }
        System.out.println("rev is>>>>"+rev);

        // 2 nd easy way to get rev
        StringBuffer sb=new StringBuffer(str);
       String st=  sb.reverse().toString();
        System.out.println(st);     //here i get reverse


        if(str.equals(st)){    //here direct equals(==) is not worked..... we have to use .equals()>-----so it worked....
            System.out.println("we are pallindrome>>>>>>>>>>");
        }else{
            System.out.println("we are not>>>>>>>>");
        }

    }
}
