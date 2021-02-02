import java.util.Arrays;

public class LeetCodePractice {
    public static int rotatedDigits(Integer N) {
        int count = 0;
        for(int i = 0; i < N; i++){
            if(i == 2 || i == 5 || i == 6 || i == 9){
                count++;
            }
        }
        return count;
    }

   public static boolean uniqueCharacters(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean permutationCheck(String str1, String str2){
        char tempArray[] = str1.toCharArray();
        Arrays.sort(tempArray);
        String string1 = new String(tempArray);
        char tempArray2[] = str2.toCharArray();
        Arrays.sort(tempArray2);
        String string2 = new String(tempArray2);
        if(string1.equals(string2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){


        System.out.println(rotatedDigits(20));
        System.out.println(uniqueCharacters("eleanor"));
        System.out.println(permutationCheck("dad", "ads"));
    }
};




