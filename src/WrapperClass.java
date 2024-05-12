import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;

public class WrapperClass {
    public static void main(String[] args) {
        int i=9;
        Integer it=Integer.parseInt("22");
        System.out.println(it);

        int it2=Integer.parseInt("233");
        System.out.println(it2); //233


            String st =  String.valueOf(it2);
        System.out.println(st); //233

        String Strobj2 = new String("Let's make it simple for you.");
        String str="ee";
        System.out.println(Strobj2.toString());
        System.out.println(Strobj2);
        System.out.println(str);
        System.out.println(str.toString());

    }
}
