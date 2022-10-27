package datatypesexcercise;

import java.util.Scanner;

public class StoreRebate {
    
    public void CalcRebate(){
        float price;

        Scanner priceInput = new Scanner(System.in);
        
        System.out.println("Everything is only 13% of its original price, what original price would you like to recaclulate?");
        
        price = priceInput.nextFloat();
        priceInput.close();

        float newPrice = price * 0.13f;

        System.out.println("The new price is " + newPrice +"kr!");
    }
}
