import java.util.Scanner;
import java.util.Random;
public class ConsoleAdventureGame {

    public static void adventureGame(){
        System.out.println("Would you like to play the game? (Enter y or n)");
        Scanner userInput = new Scanner(System.in);
        boolean play = true;
        String playResponse = userInput.nextLine();
            if(playResponse.toUpperCase().equals("n")){
                play = false;
                System.out.println("Goodbye!");

            }

        dragonRoom();

    }
    public static void userName() {
        System.out.println("What is your name?");
        Scanner nameInput = new Scanner(System.in);
        String nameResponse = nameInput.nextLine();
    }

    public static void dragonRoom(){
        Random rand = new Random();

        System.out.println(", you have entered the dragon room!");
        System.out.println("The dragon will kill you unless you answer correctly!");
        for(int i = 1; i < 6; i++) {
        int addNum1 = rand.nextInt(100);
        int addNum2 = rand.nextInt(100);
        int addNums = addNum1 + addNum2;

           System.out.println("Add " + addNum1 + " + " + addNum2);
           Scanner addInput = new Scanner(System.in);
           int enteredAddition = addInput.nextInt();
           if (enteredAddition == addNums) {
                System.out.println("You got a hit!");

           }else{
               System.out.println("Sorry! You lost!");
           }


       }
        System.out.println("You slayed the Dragon!");





    }


    public static void main(String[] args){
        adventureGame();

    }



}
