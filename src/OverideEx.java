
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
class Over{
    public int drink(int n){
        n=n+10;
        System.out.println("inside parent>>>>>>>>>>>>>");
    return n;
    }
}
class   Eat extends  Over{
    public void drink(){
        System.out.println("Inside child >>>>>");
    }
}
public class OverideEx {
    public static void main(String[] args) {
        //Over obj=new Over();
        Eat obj=new Eat();
       int y= obj.drink(12);   //parent
        System.out.println(y);
    }
}
