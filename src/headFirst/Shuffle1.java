package headFirst;

public class Shuffle1 {
    public static void main(String[] args){

        int x = 3;
        while (x > 0) {
            if (x > 2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if(x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            if (x == 2){
                System.out.print("b c");
            }

        }
        System.out.println("");
        int w = 5;
        while (w > 1){
            w = w - 1;
            if (w < 3) {
                System.out.println("small x");
            }
        }

        int y = 1;
        while (y < 10){
            y = y + 1;
            if (y > 3) {
                System.out.println("big x");
                y = y + 1;
            }
        }

        int z = 5;
        while (z > 1){
            z = z - 1;
            if (z < 3){
                System.out.println("small x");
            }
        }

    }
}
