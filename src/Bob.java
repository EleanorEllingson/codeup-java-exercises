import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please tell Bob something.");
        String conversation = userInput.nextLine();
        if(conversation.endsWith("?")){
            System.out.println("Sure");
        }
        else if(conversation.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }
        else if(conversation.isEmpty()){
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever.");
        }





    }
}
