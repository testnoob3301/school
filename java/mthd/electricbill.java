package mthd;

import java.util.Scanner;

public class electricbill {
    
    String n =""; //Name of Customer
    int units =0; //Units consumed
    double bill = 0; //Amount to be paid
    
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        n = sc.nextLine();
        System.out.print("How many units were used ? =>");
        units = sc.nextInt();
    }
    

    void calculate(){
        if(units > 300){
            bill = units-300) * 5 + (0.025*units*5);       
         }
         if(units>100&& units <300){
            bill = 2*100 + (units-100)*3.00;       
         }
         if(units<=100){
            bill = units*2.00;       
         }
    }


    void print(){
        System.out.println("Name of the customer :"+n);
        System.out.println("Number of units used :"+units);
        System.out.println("Bill amount :"+bill);
    }
   
}