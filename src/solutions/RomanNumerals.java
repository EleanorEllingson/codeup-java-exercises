package solutions;

import java.util.ArrayList;

public class RomanNumerals {

    public static void romanToInt(String str) {
        int len = str.length();

        str = str + " ";
        int result = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            char next_char = str.charAt(i + 1);

            if (ch == 'M') {
                result += 1000;
            } else if (ch == 'C') {
                if (next_char == 'M') {
                    result += 900;
                    i++;
                } else if (next_char == 'D') {
                    result += 400;
                    i++;
                } else {
                    result += 100;
                }
            } else if (ch == 'D') {
                result += 500;
            } else if (ch == 'X') {
                if (next_char == 'C') {
                    result += 90;
                    i++;
                } else if (next_char == 'L') {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } else if (ch == 'L') {
                result += 50;
            } else if (ch == 'I') {
                if (next_char == 'X') {
                    result += 9;
                    i++;
                } else if (next_char == 'V') {
                    result += 4;
                    i++;
                } else {
                    result++;
                }
            } else { // if (ch == 'V')
                result += 5;
            }


        }


        System.out.println(result);

    }

    public static void vowels(String word){

        ArrayList<Character> vowel = new ArrayList<>();

        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'i' || word.charAt(i)== 'o' || word.charAt(i)== 'u'){
                vowel.add(word.charAt(i));
            }


        }
        System.out.println(vowel);
    }


    public static void main(String[] args) {
   romanToInt("XXVII");
   vowels("Eleanor");


    }


}
