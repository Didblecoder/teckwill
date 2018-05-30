/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Dell
 */
public class Homework4 {
    
    
   
    //String afisare = String.valueOf(total);
    //double myValue = 41.4321;
    public static void main(String[] args) {
        double price = 100;
        double tax = 20; //%
        double valoareTaxei = tax/price*100;
        double total = price + valoareTaxei;
       
         System.out.println("Suma totala este " + total ); 
        // TODO code application logic here
    }
     
}
