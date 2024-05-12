import java.util.*;
import java.io.*;

public class DplicateInArrayCollection {
    public static void main(String[] args) {
         String str[]={"cc", "zz", "gg", "gg"};
         List al =new ArrayList(Arrays.asList(str));
         List al2 =new ArrayList();
         HashSet<String > hs=new HashSet<>(al);
        System.out.println(hs);   //no duplicate element .....[cc, zz, gg]
        //    Arrays.sort(al);    => its wrong.... collection sorting sathi ..another method ...u cant use array sporting method here....
        Collections.sort(al);
        if(!al2.contains(al)) {
            al2.add(al);
            System.out.println(al2 +"  ");
        }

    }
}
