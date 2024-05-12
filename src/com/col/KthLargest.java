package com.col;


import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int arr[]={1,22,44,55,66,778,888};
        Arrays.sort(arr);
        for( int aa:arr){
            System.out.print(aa);
        }
    }
}
