package mthd;

import java.util.Scanner;

public class FruitJuice {
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    
    FruitJuice(){
        int product_code = 0;
        String flavour = "";
        String pack_type = "";
        int pack_size = 0;
        int product_price = 0;
    }
    
    void  input(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the product code :");
            product_code = sc.nextInt();
            System.out.print("Enter the flavour :");
            flavour = sc.nextLine();
            System.out.print("Enter the pack type :");
            pack_type = sc.nextLine();
            System.out.print("Enter the pack size :");
            pack_size = sc.nextInt();
            System.out.print("Enter the product price :");
            product_price = sc.nextInt();
    }
    void discount(){
        int discount = (int) (product_price -(product_price)*10/100);
        product_price = product_price-discount;
    }
    void display(){
        System.out.println("Product_code : "+product_code);
        System.out.println("Flavour : "+flavour);
        System.out.println("Pack Type : "+pack_type);
        System.out.println("Pack size : "+pack_size);
        System.out.println("Product price : "+product_price);
    }
    public static void main(String[] args) {
        FruitJuice product = new FruitJuice();
        product.input();
        product.discount();
        product.display();
    }
}
