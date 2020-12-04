import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i);
//                System.out.print(" ");
//            i++;
//        }

//        int i = 1;
//
//        do {
//            System.out.println(i += 1);
//
//            i++;
//        }
//        while (i <= 100);

//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        }
//        while (i >= -10);

//        long i = 2L;
//
//        do {
//            System.out.println(i);
//           i = (long) Math.pow(i, 2L);
//
//        }
//        while (i < 1000000L);


//        for(int i = 2; i < 1000000;){
//            System.out.println(i);
//            i = (int) Math.pow(i, 2);
//        }


//        for(int i = 1; i <= 100; i += 1){
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }
//
//
//            else{
//                System.out.println(i);
//            }
//        }

        Scanner userInput = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int userNumber = userInput.nextInt();
//        System.out.println("Here is your table");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        int number = 1;
//        while (number <= userNumber){
//            System.out.print(number + "\t   | ");
//            System.out.print((int) Math.pow(number, 2) + "\t\t | ");
//            System.out.print((int) Math.pow(number, 3) + "\t\n");
//        number++;
//        }
        System.out.println("Enter your grade. (0-100)");
        int grade = userInput.nextInt();
        if(grade <= 100 && grade >= 88){
            System.out.println("You have an A");
        }
        else if(grade <= 87 && grade >= 80){
            System.out.println("You have an B");
        }
        else if(grade <= 79 && grade >= 67){
            System.out.println("You have an C");
        }
        else if(grade <= 66 && grade >= 60){
            System.out.println("You have an D");
        }
        else if(grade <= 59 && grade >= 0){
            System.out.println("You have an F");
        }
        else {
            System.out.println("Invalid");
        }




    }
}
