package com.col;
import java.lang.reflect.Array;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("bb");
        al.add("bb");
        al.add("vv");
        HashSet<String> hs=new HashSet<>(al);
       // System.out.println(hs);  //here  i got duplicate

        Map<String, Integer> hm=new HashMap<String, Integer>();
        hm.put("dd" , 1);
        hm.put("gg" , 1);
        hm.put("dd" , 1);
        for(Map.Entry<String, Integer>  obj : hm.entrySet()){
           // System.out.println(obj);     //  here  duplicate key  => Not ok   :   value  = ok
            String str=obj.getKey();  //get all keys from here  , and putting into the string
            List<String> all=new ArrayList<>();  //below here, i try to put all string into arraylist......
           all.add(str);
            //System.out.println(al);
        }





        int[] intarray = {1, 2, 3, 4, 5,3,7,5,22};
        String str[]={"ss", "gg" ,"pp"};

        List<Integer> list = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<String>();

        for (int a : intarray)
            list.add(a);
        System.out.println( "before sorting >>>>"+list);
        Collections.sort(list);
        System.out.println( "After sorting >>>>"+list);

       //   System.out.println(list);  //  1 st traditional way ..... int array al
        for (String ab : str)
            list2.add(ab);

       // System.out.println(list2);   // 1 st traditional  way , create new arraylist => iterrate loop => add method()

        List<String> ll=Arrays.asList(str);  //2 nd way ,
        List<String> intll2=Arrays.asList(Arrays.toString(intarray));  //2 nd way ,

       // System.out.println(intll2);


        Object[] objects = al.toArray();   //convert al to array

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}
