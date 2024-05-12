package com.col;
class Game{
    int b=8;                 //directly we can access..using super class.........
    public  int test(){          //we can directly  access this in below.........
        int a=9 , n=8, c;
         c=a+b;
        System.out.println(c);
        System.out.println("parent>>>>>>>");
        return c;
    }
}
class Sport extends  Game{
    int a=2;
    public  void test1() {
        System.out.println("child>>>>>>>");
        int v=test();           // see  here we have used , above parent  method.....
        int n=super.b+12;   //here as well we care using the , parent class variable ....
        System.out.println(n);
    }
 }
public class InheritanceJava {
    public static void main(String[] args) {
Sport sp=new Sport();
sp.test1();
    }
}
