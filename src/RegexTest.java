import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
public class RegexTest {
    public static void main(String[] args) {

     String str="ggg g gbgfb , gbd ";
     str=str.replaceAll("\\s+" ,"");
        System.out.println(str);    //gggggbgfb,gbd

        String str2="ertyy ff vv cc ";
        str2=str2.replaceAll("\\s+" ,"_");
    //    System.out.println(str2);  //ertyy_ff_vv_cc_

       // String str2="ertyy ff vv cc ";
        str2=str2.replace(" " ,"_");
      //  System.out.println(str2);

         String str3="ertWEERyy ff vv cc12@#$%  ";
        str3=str3.replaceAll("[A-Za-z0-9@#$]", " ");
          System.out.println(str3);  //%


        String input = "Hello! How are you@@#$#?";
        String output = input.replaceAll("[a-zA-Z0-9!#$#$]", "");
        System.out.println(output);
    }
}
