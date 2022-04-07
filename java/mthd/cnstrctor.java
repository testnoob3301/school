package mthd;

import javax.swing.filechooser.FileNameExtensionFilter;

public class cnstrctor {
    
     int final_price =0;

    public cnstrctor(int original, int discount){
        final_price = original - discount; 
    }

    public cnstrctor(int price){
        final_price = price;
    }
     void display(){
        System.out.print(final_price);
    }
}
