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

    public static void main(String[] args){


        System.out.println(rotatedDigits(20));
    }
};




