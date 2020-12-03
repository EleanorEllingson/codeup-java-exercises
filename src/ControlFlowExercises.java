public class ControlFlowExercises {
    public static void main(String[] args){

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 1;
//
//        do {
//            System.out.println(i += 1);
//
//            i++;
//        }
//        while (i <= 100);

//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        }
//        while (i >= -10);

//        int i = 2;
//
//        do {
//            System.out.println(i);
//           i = (int) Math.pow(i, 2);
//
//        }
//        while (i < 1000000);


//        for(int i = 2; i < 1000000;){
//            System.out.println(i);
//            i = (int) Math.pow(i, 2);
//        }


        for(int i = 1; i <= 100; i++){

            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            if (i % 5 == 0){
                System.out.println("Buzz");
            }
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }






    }
}
