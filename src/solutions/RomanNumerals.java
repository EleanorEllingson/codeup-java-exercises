package solutions;

public class RomanNumerals {

    public static void romanToInt (String s){

            int I = 1;
            int V = 5;
            int X = 10;
            int L = 50;
            int C = 100;
            int D = 500;
            int M = 1000;

            int sum = 0;


            for (int i = 0; i < s.length(); i++) {

                sum += i;
            }
        System.out.println(sum);


        }
    public static void main(String[] args) {
   romanToInt("XXVII");
    }


}
