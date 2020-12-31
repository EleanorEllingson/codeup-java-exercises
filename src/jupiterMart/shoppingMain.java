package jupiterMart;



import java.util.ArrayList;

public class shoppingMain {
    public static void main(String[] args){
        Person me = new Person("El", "Ellingson");

        ArrayList<products> cart = new ArrayList<>();

        computers laptop = new computers("first", true);
        cellPhones iphone = new cellPhones("new", "mini");

        laptop.setPrice(500.00);
        iphone.setPrice(400.00);

        cart.add(laptop);
        cart.add(iphone);

        int idCounter = 0;
        for(products item : cart){
            item.setId(idCounter);

            System.out.println("Your total is: $" + me.askForMoney(cart));
        }

    }

}
