import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public void addGrades(double grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(double grade:grades){
            sum += grade;


        }
        return sum / grades.size();
    }

    public static void main(String[] args){
        Student student = new Student("Fred");
        System.out.println(student.getName());
        student.addGrades(90);
        student.addGrades(50);
        System.out.println(student.getGradeAverage());

    }
}
