package practiceJupiterMart;


import java.util.ArrayList;

public class shoppingMain  {
    public static void main(String[] args){
        person me = new person("Eleanor", "Ellingson");

        ArrayList<products> cart = new ArrayList<>();

        Cumputers laptop = new Cumputers("first", true);
        phones iphone = new phones("new", "small");

        laptop.setPrice(1000.00);
        iphone.setPrice(500.00);

        cart.add(laptop);
        cart.add(iphone);

        int idCounter = 0;
        for (products item : cart){
            item.setId(idCounter);

        }
        System.out.println("Your total is: $" + me.askForMoney(cart));


    }
}
