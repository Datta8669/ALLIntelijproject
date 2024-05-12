package com.col;

import java.util.stream.Stream;

class  Parent{
    String name;
    String colour;
    String division;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Parent(String name, String colour, String division) {  //this should be in that method only ...
        this.name = name;
        this.colour = colour;
        this.division = division;
    }

    public void  test() {
        int a=8, q=8;
        System.out.println(">>>>>>>class>>>");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
public class ClassObjConstructor {
    public static void main(String[] args) {
   Parent op=new Parent("datta", "white" , "A");
        System.out.println(op);  //this will work , only when toString method we i

    }
}
