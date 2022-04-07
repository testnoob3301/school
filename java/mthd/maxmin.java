package mthd;

import java.util.Scanner;

public class maxmin {
    int a = 0;
    int b =  0;
    int answer = 0;

    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
    }
    void minoftwo(){
        answer = a<b?a:b;
        System.out.println(answer);
    }
    public static void main(String[] args) {
        maxmin no = new maxmin();
        no.minoftwo();
    }
}
