
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
public class CollectionClassMethod {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("zz");
        al.add("gg");
        al.add("jj");
//Iteration of an array
       /* Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }*/
/*for(String st:al)
{
    System.out.println(st+ ">>>" );
}*/
        Collections.sort(al);
        System.out.println(al);

        Collections.addAll(al, "kk");
        System.out.println(al);

        String[] strArr = {"C#", ".Net"};
        Collections.addAll(al, strArr);  //addition of new array to araylist
        //        System.out.println(al);

        //convert al to array
        String [] str=new String[al.size()];  // here i need new string array ..............
        str = al.toArray(str);  //here i need array
        for(String strr:str) {   //Iteration is necessary to print any array ...u cant directly print that ....... System.out.println(strr+ ">>>" );
}
    }
}
