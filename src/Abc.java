

import java.lang.*;
 class SuperThis {
     //wanted to show the diff between   super ()  -> for unparamtrised constructor
     //wanted to show the diff between   super (value)  -> for parametrised  constructor
    int age;
    public SuperThis() {
        System.out.println(">>>>super() called here>>>>>>>");
    }
    public SuperThis(int  age) {
   this.age=age;
    }
    public void test(){
        System.out.println(">>>>>>");
    }
     public  static void Test55(){
         System.out.println(">>>inside super.() method >>>");
     }
 }
    class Abc extends  SuperThis{
     int roll;
        // calling here is , current    vs    parent
        //if anything u want is of parent then use super       , for child u can use this.....
        Abc(){
            super();    //only  non-parameterised const call.....
        }
        Abc( int age, int roll){
            super(age);   //calling here as a parent ........by using super keywords.....
            this.roll=roll;  //calling here as a currrent  class variable.....
        }
        public void test2(){
            super.Test55();      //calling parent class method in a child
            System.out.println(">>>>>>"+age);
            System.out.println(">>>>>>"+roll);
        }
        public static void main(String[] args) {
 Abc an=new Abc(22,33);
  an.test2();

        }
    }

