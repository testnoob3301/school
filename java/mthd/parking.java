package mthd;

import java.util.Scanner;

public class parking {
    int vno =0; //Vehicle number;
    int hours=0; //Time for which the vehicle was parked;
    double bill=0.0;


void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the vehicle number: ");
    vno = sc.nextInt();
    System.out.print("For how many hours do you want to keep: ");
    hours=sc.nextInt();
}
void display(){
    System.out.println("Your vehicle number is: "+vno);
    System.out.println("You kept your vehicle for "+hours+" hours");
    System.out.println("Your total amount will be: "+bill);
}
void calculate(){
    bill = 3+(hours-1)*1.50;
}
    public static void main(String[] args) {
        parking customer = new parking();
        customer.input();
        customer.calculate();
        customer.display();
    }
}