
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
public class ThisKeyword {  //current class instance variable
    int i;
    public  void calc( int i){
       i=i;
        System.out.println(i);
    }
    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword();
       obj.calc(12);
    }
}
