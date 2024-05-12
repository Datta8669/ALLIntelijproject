import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
public class MapTest {
    //map to list    map to set...
    public static void main(String[] args) {
      Map<String, Integer> mp = new HashMap<>();
      mp.put("rr",1);
      mp.put("oo",2);
      mp.put("dd",3);

        //System.out.println(mp);
        //Set<String> valueSet= new HashSet<String>(mp.values());
         //System.out.println(valueSet);
        System.out.println(mp.values()+">>>>>");

         for(Map.Entry<String, Integer> m:mp.entrySet()){

             String st= m.getKey();
            int st2= m.getValue();
            String[] sNums = Integer.toString(st2).split("");   //best way to convert string to string array
            for (String s : sNums) {
                //System.out.println(s);
            }
            /* int in=12;
            String gg="13";
            String  dp=Integer.toString(in);  //integet ko string me
            System.out.println(dp);
              int n=Integer.parseInt(gg);
            System.out.println(n);*/


            /*String str7="i am a nboy";
            String rr[]=str7.split(" ");    //best way to convert string to an array , split it with space and kept in an array
            for( String tt: rr){     // can covert  int as well as string ...........
                System.out.println(tt);
            }*/



            // convert array to arrayloist
            /*List al = Arrays.asList(sNums);
            System.out.print(al);*/

            //method 2nd

           /* List ls=new ArrayList<>(Arrays.asList(sNums));
            System.out.println(ls);*/


            }
        }
    }