package mthd;

import java.util.Scanner;
public class RailwayTicket {
        String name = "";
        String coach = "";
        long mobno = 0;
        int amt =0;
        int totalamt =0;
        
        
        void accept(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = sc.next();
            System.out.print("Enter the type of coach you want :");
            coach = sc.next();
            System.out.print("Enter the mobile number : ");
            mobno = sc.nextLong();
            System.out.print("Enter the amount: ");
            amt = sc.nextInt();
        }
        
        
        void update(){
            int addup;
            switch (coach) {
                case "First_AC":
                addup = 700;    
                break;
                
                case "Second_AC":
                addup = 500;    
                break;

                case "Third_AC":
                addup = 250;    
                
                default:
                addup = 0;
                break;
            }
            totalamt = amt+addup;
        }


        void display(){
        System.out.println("Name: "+name);            
        System.out.println("Coach: "+coach);            
        System.out.println("Total_amount: "+totalamt);            
        System.out.println("Mobile_number: "+mobno);            
        }

        public static void main(String[] args) {
            RailwayTicket customer = new  RailwayTicket();
            customer.accept();
            customer.update();
            customer.display();
        }
    }

