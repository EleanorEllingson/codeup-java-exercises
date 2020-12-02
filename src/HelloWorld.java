public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello, World!");
        System.out.print("Hello, World!");

        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        float myNumber = (float) 3.14;
        System.out.println(myNumber);


        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //You can't name a variable class because class is a reserved words

        //'three' cannot be an integer ** see error in run time**
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


            //**See error in compile time**
//        int three = (int) "three";

         x = 4;
//        x = x + 5;
        x += 5;
        System.out.println(x);


        x = 3;
        int y = 4;
//        y = y * x;
        y *= x;
        System.out.println(y);



//
//
         x = 10;
         y = 2;
//        x = x / y;
//        y = y - x;

        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);
    }
}
