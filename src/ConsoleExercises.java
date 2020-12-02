import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner userInput = new Scanner(System.in);

//        System.out.println("Please enter a number.");
//        int number = userInput.nextInt();
//
//        System.out.println(number);

//An error occurs if it isn't an integer

//        System.out.println("Please enter your first, middle, and last name.");
//        String firstName = userInput.next();
//        String middleName = userInput.next();
//        String lastName = userInput.next();
//
//        System.out.println(firstName);
//        System.out.println(middleName);
//        System.out.println(lastName);

//        System.out.println("Please enter your favorite quote.");
//        String quote = userInput.nextLine();
//        System.out.println(quote);

        //next just captures the first word

        System.out.println("Please enter the length, and width of your room");
        String length = userInput.nextLine();
        String width = userInput.nextLine();

        int lengthN = Integer.parseInt(length);
        int widthN = Integer.parseInt(width);
        int area = lengthN * widthN;
        int perimeter = 2 * (lengthN + widthN);

        System.out.printf("The area of the room is %s\n", area);
        System.out.printf("The perimeter of the room is %s\n", perimeter);



    }
}
