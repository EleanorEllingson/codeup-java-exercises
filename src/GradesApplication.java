import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication extends Student{
    public GradesApplication(String name){
        super(name);
    }

    public static void main(String[] args) {


        Student student1 = new Student("Fred");

        student1.addGrades(90);
        student1.addGrades(50);
        student1.addGrades(75);

        Student student2 = new Student("George");

        student2.addGrades(60);
        student2.addGrades(72);
        student2.addGrades(82);

        Student student3 = new Student("Harry");

        student3.addGrades(85);
        student3.addGrades(87);
        student3.addGrades(92);

        Student student4 = new Student("Ron");

        student4.addGrades(65);
        student4.addGrades(72);
        student4.addGrades(52);



        HashMap<String, Student> student = new HashMap<>();
        student.put("Fred123", student1);
        student.put("George123", student2);
        student.put("Harry123", student3);
        student.put("Ron123", student4);


        ArrayList<String> userNames = new ArrayList<String>(student.keySet());

        System.out.println("Welcome");
        boolean applicationRunning = true;
        while (applicationRunning) {
            System.out.println("Here are the GitHub usernames of our students:");
            for (String user : userNames) {
                System.out.print("|" + user + "| ");
            }
            System.out.println(" ");
            Scanner userInput = new Scanner(System.in);

            System.out.println("What student would you like to see more information on?");
            String choice1 = userInput.nextLine();

            if (userNames.contains(choice1)) {
                System.out.printf(student.get(choice1).getName() + ": - " + "GitHub Username: " + choice1 + "\n" + "Current Average: " + student.get(choice1).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + choice1);
            }


            System.out.println("Would you like to see another student?");
            Input scanner2 = new Input();
            boolean shouldContinue = scanner2.yesNo();
            if (!shouldContinue) {
                applicationRunning = false;
                System.out.println("GoodBye!");
            }

        }
    }
}
