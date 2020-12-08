import java.util.Scanner;
import java.util.Random;
public class ConsoleAdventureGame {

    public static String userName;
    public static int userLives;

    public static void adventureGame(){
        System.out.println("Would you like to play the game? (Enter y or n)");
        Scanner userInput = new Scanner(System.in);
        boolean play = true;
        String playResponse = userInput.nextLine();
            if(playResponse.toUpperCase().equals("n")){
                play = false;
                System.out.println("Goodbye!");

            }
        System.out.println("What is your name?");
        Scanner nameInput = new Scanner(System.in);
        userName = nameInput.nextLine();
        dragonRoom();

    }


    public static void dragonRoom() {
        Random rand = new Random();

        System.out.println(userName + ", you have entered the dragon room!");
        System.out.println("The dragon will kill you unless you answer correctly!");
        int dragonLife = 5;
        userLives = 5;
        System.out.println("You start out with 5 lives");
        System.out.println("The dragon starts out with 5 lives");
        while (dragonLife > 0 && userLives > 0) {
            int addNum1 = rand.nextInt(100);
            int addNum2 = rand.nextInt(100);
            int addNums = addNum1 + addNum2;

            System.out.println("Add " + addNum1 + " + " + addNum2);
            Scanner addInput = new Scanner(System.in);
            int enteredAddition = addInput.nextInt();
            if (enteredAddition == addNums) {
                System.out.println("You got a hit! The dragon loses a life!");
                dragonLife -= 1;
                System.out.println("The dragon has " + dragonLife + " lives left.");
                if (dragonLife == 0) {
                    System.out.println("YOU SLAYED THE DRAGON!!!!");

                }

            } else {
                System.out.println("Sorry! You lost a life!");
                userLives -= 1;
                System.out.println(userName + " has " + userLives + " lives left.");
                if (userLives == 0) {
                    System.out.println("YOU DIED!!!!");
                }
            }



        }
    }

        public static void monsterRoom(){
            Random rand2 = new Random();

            System.out.println(userName + ", you have entered the monster room!");
            System.out.println("The monster will kill you unless you answer correctly!");
            int monsterLife = 5;

            System.out.println("You start out with " + userLives + " lives");
            System.out.println("The monster starts out with 5 lives");
            while (monsterLife > 0 && userLives > 0) {
                int multNum1 = rand2.nextInt(10);
                int multNum2 = rand2.nextInt(10);
                int multNums = multNum1 * multNum2;

                System.out.println("Multiply " + multNum1 + " x " + multNum2);
                Scanner addInput = new Scanner(System.in);
                int enteredMultiplication = addInput.nextInt();
                if (enteredMultiplication == multNums) {
                    System.out.println("You got a hit! The monster loses a life!");
                    monsterLife -= 1;
                    System.out.println("The monster has " + monsterLife + " lives left.");
                    if(monsterLife == 0){
                        System.out.println("YOU SLAYED THE MONSTER!!!!");

                    }

                }else{
                    System.out.println("Sorry! You lost a life!");
                    userLives -= 1;
                    System.out.println(userName + " has " + userLives + " lives left.");
                    if(userLives == 0){
                        System.out.println("YOU DIED!!!!");
                    }
                }


            }






    }


    public static void main(String[] args){
        adventureGame();
        monsterRoom();

    }



}
