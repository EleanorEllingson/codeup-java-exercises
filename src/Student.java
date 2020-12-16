import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList grades = new ArrayList<>();

    public Student(String name, ArrayList grades){
        this.name = name;
        this.grades = grades;
    }
    grades.add(87);

    // returns the student's name
    public String getName(){
        return name;
    }

    public ArrayList addGrades(int grade){
        return grades;
    }

//    public double getGradeAverage(){
//
//    }

    public static void main(String[] args){

        System.out.println();



    }
}
