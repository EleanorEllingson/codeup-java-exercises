package practiceJupiterMart;

import java.util.ArrayList;

public class person {
    private String firstName;
    private String lastName;

    public person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void ringItem(products item){
        System.out.println("ID # " + item.getId() + " cost " + item.getPrice() );
    }

   public double askForMoney(ArrayList<products> cart){
        double total = 0;
        for(products item : cart){
            total += item.getPrice();
        }
        return total;
   }
}
