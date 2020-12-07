import java.util.Scanner;
import java.util.Random;
public class HighLow {

    public static void highLow(){
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        boolean stillGuessing = true;
        int count = 0;
        while (stillGuessing) {
            System.out.println("Guess a number between 1 and 100. (you only have 6 guesses!)");
            Scanner userInput = new Scanner(System.in);


            int enteredNum = userInput.nextInt();
            if (enteredNum >= 1 && enteredNum <= 100) {
                System.out.println("Valid Entry");
                    count ++;
                    System.out.println("You have used: " + count + " guesses.");
                    if(count > 5){
                        System.out.println("You lose");
                        stillGuessing = false;
                    }
                if (enteredNum == randNum) {
                    System.out.println("GOOD GUESS!");
                    stillGuessing = false;
                } else if (enteredNum < randNum) {
                    System.out.println("HIGHER");
                } else if (enteredNum > randNum) {
                    System.out.println("LOWER");
                }
            } else {
                System.out.println("Invalid entry");
            }
        }




    }











    public static void main(String[] args){
        highLow();

    }




}
