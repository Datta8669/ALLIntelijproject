
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
class Test8{

    String name;
   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Test8() {

   }

    @Override
    public String toString() {
        //  return "Test8{" + "name='" + name + '\'' + ", age=" + age + '}';
        return "name=" + name + " age=" + age;
    }
    Test8(String n, int j){
this.name=n;
this.age=j;
    }
    Test8( int b){
     this.age=b;
    }
}
public class ConstructorGetterSetter {

    public static void main(String[] args) {
     Test8 obj=new Test8("ADDD" , 44);
     Test8 ob=new Test8("ADDD" , 33);
        System.out.println(obj.name);
        System.out.println(obj);   //for this we have to overide the to string method...
    }
}

