import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {

    public static int addition(int num1, int num2){

        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){

        return num1 - num2;
    }
    public static int multiplication(int num1, int num2){

        return num1 * num2;
    }
    public static int division(int num1, int num2){

        return num1 / num2;
    }

    public static int modulus(int num1, int num2){

        return num1 % num2;
    }


    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10.");
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        if(num >= min && num <= max){
            return num;
        }else {return getInteger(min, max);}


    }


    public static void getFactorial(){
        System.out.println("Enter a number between 1 and 10.");
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        if(num >= 1 && num <= 10){
            long factorialL = 1;

            for(int i = 1; i <= num; i++){
                factorialL *= i;

            }
            System.out.println(factorialL);
        }else {
            System.out.println("Number is invalid.");

        }
        System.out.println("Do you want to continue? (Y or N)");
        Scanner userString = new Scanner(System.in);
        String response = userString.nextLine();
        if(response.toUpperCase().equals("Y")){
            getFactorial();
        }
    }

    public static void diceRoll(){
        System.out.println("Enter the number of sides for your dice.");
        Scanner userInput = new Scanner(System.in);
        Random rand =new Random();
        int sides = userInput.nextInt();
        int dice1 = rand.nextInt(sides);
        int dice2 = rand.nextInt(sides);

            System.out.println(dice1);

            System.out.println(dice2);


        System.out.println("Would you like to roll again? Y or N");
        Scanner userDice = new Scanner(System.in);
        String response = userDice.nextLine();
            if(response.toUpperCase().equals("Y")){
                diceRoll();
            }

    }


    public static void main(String[] args) {
        System.out.println(addition(3, 4));
        System.out.println(subtraction(10, 2));
        System.out.println(subtraction(2, 6));
        System.out.println(division(9, 3));
        System.out.println(modulus(10, 3));
        getInteger(1, 10);
        getFactorial();
        diceRoll();

    }


}
