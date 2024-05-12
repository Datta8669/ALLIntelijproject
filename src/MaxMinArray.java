import java.util.*;

public class MaxMinArray {
    public static void main(String[] args) {
        int arr[] = {100, 27, 3883, 4994, 55};
          Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);   // here if we want all element here...
            System.out.println(arr[2]);  // 2 nd element also we can find ....
            System.out.println(arr[3]);   //3rd element also we can find here .....
            System.out.println("min-" + arr[0] + " max-" + arr[arr.length - 1]);  // 1 st and last element means max and min.....
        }
int max=arr[0];   //just for compare
int min=arr[0];   //just for compare, we can take anything ....
        //find max and min in array..
        for(int i=0;i<arr.length;i++){
              if(arr[i]>max){  //all element compare this section, to that single section......
               max=arr[i];
              }else if (arr[i]<min){
                 min =arr[i];
              }
        }
        System.out.println(max);
        System.out.println(min);


        Arrays.sort(arr);
        System.out.println("Min value "+arr[0]);
        System.out.println("Max value "+arr[arr.length-1]);

















       /* int i = 1;
        while (i <= 19) {  //while(true)  //jabtak true , till then i will execute
            System.out.println(">>>");   //this keep executing, till the condition become true
            i++;*/
        }
    }
