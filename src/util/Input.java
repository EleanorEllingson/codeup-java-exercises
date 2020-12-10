package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);
    }

    public String getString(){

        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Type in yes or no");
        String userString = this.scanner.next();
        return(userString.trim().toLowerCase().equals("y") || userString.trim().toLowerCase().equals("yes"));
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number that is between " + min + " and " + max);
        int number = this.scanner.nextInt();
        if(number >= min && number <= max){
          return number;
        }else {
            return getInt(min, max);
        }
    }
    public int getInt(){
        System.out.println("Enter a number");
        int number2 = this.scanner.nextInt();

            return number2;

    }

    public Double getDouble(double min, double max){
        System.out.println("Enter a number that is between " + min + " and " + max);
        double decNumber = this.scanner.nextDouble();
        if(decNumber >= min && decNumber <= max){
            return decNumber;
        }else {
            return getDouble(min, max);
        }
    }
    public Double getDouble(){
        System.out.println("Enter a number");
        double decNumber2 = this.scanner.nextDouble();
            return decNumber2;

    }
}



class InputTest {
    public static void main(String[] args) {
        Input scanner1 = new Input();
        System.out.println(scanner1.getInt(1, 10));
        Input scanner2 = new Input();
        System.out.println(scanner2.getInt());
        Input scanner3 = new Input();
        System.out.println(scanner3.yesNo());
        Input scanner4 = new Input();
        System.out.println(scanner4.getDouble(.1, .9));
        Input scanner5 = new Input();
        System.out.println(scanner5.getDouble());

    }
}

