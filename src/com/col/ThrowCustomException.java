package com.col;

public class ThrowCustomException {

    //to check the entered no is prime no....
    public static boolean isPrimeNo( int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("yes>>>>count is true>>>");
            return  true;     //if control come here, then program terminated here....
        }
        return false;          //by default we are returning as false..........  //becoz above agar true... too above se program terminate ho jayega...
    }
    public static void main(String[] args) {
       boolean b= isPrimeNo(6);
        System.out.println("output coming from method..........."+b);


        //prime no print addition.... from 1 to 100
       int n=100;
        int count;
        int sum=0;
        for(int i=1;i<=100;i++){  //this is for all 1 to 100 iteration..
             count=0;
            for(int j=1;j<=i;j++){     //this iteration is upto that perticular  no...
                if(i%j==0){
                    count++;
                }
            }
            if(count==2) {           // 2 nch ka ...becoz.. for prime no : one  & same no dividation is equal  ==0.....
                System.out.println("primr no...."+i);
                 sum=sum+i;  //here my need is to put same variable value in same variable.......so i defined sum variable
            }
        }
        System.out.println("sum is>>>>>>>"+sum);  //here we find sum as well from 1 to 100...



    }
}
