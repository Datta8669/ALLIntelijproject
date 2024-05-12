import java.io.FileWriter;
import java.util.*;
import java.lang.*;
public class BooleanTest {
    public  static boolean isAge( int age ){
        if(age<44) {
            return true;
        }  else {
             if(age==55) {
                return true;
            } else if (age>55) {
                return true;
            }
        }
        System.out.println(">>>>>>outside both loop >>>");
      return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AGE");
         int  b = sc.nextInt();
        System.out.println(b);
        System.out.println(isAge(b));
    }
}
