public class warmUps {

public static int cubed(int num){


    return (int) Math.pow(num, 3);

}

public static int subtract(int num1, int num2){
    return num1 - num2;
}
public static double subtract(double num1, double num2){
    return num1 - num2;
}


public static void main(String[] args){
    System.out.println(cubed(2));;
    System.out.println(subtract(4, 2));
    System.out.println(subtract(4.5, 2.5));
}
}
