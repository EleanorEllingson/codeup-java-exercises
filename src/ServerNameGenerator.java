import java.security.PublicKey;
import java.util.Random;

public class ServerNameGenerator {

    final static String[] adjectiveArray = {"Agreeable", "Polite", "Helpful", "Dynamic", "Funny", "Clean", "Alluring", "Endurable", "Cheerful", "Elated"};

    final static String[] nounArray = {"Sunlight", "Ukelele", "Walnut", "Economics", "Panther", "Blood", "Grasshopper", "Keyboard", "Eyes", "Village"};

    public static String getRandomArrayValue(String[] array){
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args){
        System.out.println("Here is your server name:");
        System.out.println(getRandomArrayValue(adjectiveArray) + "-" + getRandomArrayValue(nounArray));
    }


}
