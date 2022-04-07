package mthd;

import java.util.Scanner;


public class prmauto {
    int n = 0;
    /*Take the number */
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number please: ");
        n = sc.nextInt();
    }
    //Prime
    public String isprime(){
       String x ="PRIME";
        for(int i=2;i<n-1;i++){
           if(n%i==0){
            x="NOT PRIME";
        }
       }
           return x;
    }


    public String automorphic(){
    int a = n*n;
    int b = Integer.toString(n).length();
    int y = (int) Math.pow(10, b);
    String x = "NOT AUTOMORPHIC";
    if((a%y)==n){
        x= "Automorphic";
    }
    return x;
    }


    void run(prmauto object){
        object.accept();
        System.out.print("The number is ");
        String y = "";
        y = object.automorphic();
        System.out.print(y + " and "); 
        y = object.isprime();
        System.out.print(y);
    }
}