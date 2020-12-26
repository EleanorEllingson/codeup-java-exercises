package headFirst;

public class MyFirstApp {
    public static void main (String[] args){
        System.out.println("I Rule!");
        System.out.println("The World");

        int x = 1;
        while (x < 5){
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1;
        }
        if(x == 5){
            System.out.println("Do");
        }

        int milkNum = 99;
        String word = "bottles";

        while (milkNum > 0) {

            if (milkNum == 1) {
                word = "bottle";
            }

            System.out.println(milkNum + " " + word + " of milk on the wall");
            System.out.println(milkNum + " " + word + " of milk");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            milkNum = milkNum - 1;

            if (milkNum > 0) {
                System.out.println(milkNum + " " + word + " of milk on the wall" );

            }else {
                System.out.println("No more bottles of milk on the wall");
            }


        }
    }

}