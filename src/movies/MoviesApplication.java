package movies;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args){

        boolean applicationRunning = true;
        while (applicationRunning){
        System.out.println("Choose from the following.");
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
        if(userChoice == 1) {
//
            Movie[] movieArray = MoviesArray.findAll();
            for (int i = 0; i < movieArray.length; i++) {
                Movie movie = movieArray[i];
                System.out.println(movie.getName() + " -- " + movie.getCatergory());
            }
        }
         else if (userChoice == 2){
//
                Movie[] movieArray = MoviesArray.findAll();
                for(int i = 0; i < movieArray.length; i++){

                    Movie movieAnimated = movieArray[i];
                    if(movieAnimated.getCatergory().equals("drama")) {
                        System.out.println(movieAnimated.getName() + " -- " + movieAnimated.getCatergory());
                    }
                }
        }
        else if (userChoice == 3){
//
            Movie[] movieArray = MoviesArray.findAll();
            for(int i = 0; i < movieArray.length; i++){

                Movie movieAnimated = movieArray[i];
                if(movieAnimated.getCatergory().equals("animated")) {
                    System.out.println(movieAnimated.getName() + " -- " + movieAnimated.getCatergory());
                }
            }
        }
        else if (userChoice == 4){
//
            Movie[] movieArray = MoviesArray.findAll();
            for(int i = 0; i < movieArray.length; i++){

                Movie movieAnimated = movieArray[i];
                if(movieAnimated.getCatergory().equals("horror")) {
                    System.out.println(movieAnimated.getName() + " -- " + movieAnimated.getCatergory());
                }
            }
        }
        else if (userChoice == 5){
//
            Movie[] movieArray = MoviesArray.findAll();
            for(int i = 0; i < movieArray.length; i++){

                Movie movieAnimated = movieArray[i];
                if(movieAnimated.getCatergory().equals("scifi")) {
                    System.out.println(movieAnimated.getName() + " -- " + movieAnimated.getCatergory());
                }
            }
        }

        else if (userChoice == 0){
            applicationRunning = false;
            System.out.println("Goodbye!");
        }
        System.out.println("Do you want to continue?");
        Input scanner2 = new Input();
        boolean shouldContinue = scanner2.yesNo();
          if(!shouldContinue) {
              applicationRunning = false;
              System.out.println("GoodBye!");
          }
        }

    }

}
