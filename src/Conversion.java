import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
public class Conversion {
    public static void main(String[] args) {
        String str[]={"ff","hh","pp"};   //array to list
        String stg="abcd";
         char ch[]=stg.toCharArray();
         for(char ch2:ch){
             System.out.println(ch2);   ///one by one if u want....
         }


        String st="datta, patil, bamni";   //convert into array
        String a[]=st.split(",\\s");
        for(String dd:a) {
            System.out.println(dd);
        }
        List<String> al3= new ArrayList<>(Arrays.asList(st));
        //List<String> al3= Arrays.asList(st);      // took normal string
        System.out.println(al3+" >>>");     // [datta, patil, bamni]
          for(String sd:al3) {
            System.out.println(sd+"====");        //one by one, if u want..
        }
         List<String> al= Arrays.asList(str);     // took string array
        System.out.println(al);      //  [ff, hh, pp]
         for(String sd:al) {
            System.out.println(sd);   //one by one, if u want..
        }

            }
}
