package movies;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args){

        System.out.println("0 - exit");
        System.out.println("1 - view all movies ");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("Enter your choice:");
        Input scanner1 = new Input();
        int userChoice = scanner1.getInt(0, 5);

        //I have user selection--need to tie number to what they select

    }
}
