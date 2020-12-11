import java.util.Arrays;


public class ArraysExercises {
    public static Person[] addPerson(Person[] oldPersonArray) {
        Person[] newPersonArray = new Person[oldPersonArray.length + 1];
        for(int i = 0; i < oldPersonArray.length; i++){
            newPersonArray[i] = oldPersonArray[i];
        }
        return newPersonArray;

    }


    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] personArray = new Person[3];
        personArray[0] = new Person("Joshua");
        personArray[1] = new Person("Ethan");
        personArray[2] = new Person("Michael");
//        System.out.println(Arrays.toString(personArray));
        for(Person person : personArray){
            System.out.println(person.getName());
        }
        personArray = addPerson(personArray);
        personArray[3] = new Person("Rebecca");
        for(Person person : personArray){
            System.out.println(person.getName());
        }

        }



    }


