package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;

    private ArrayList<Integer> studentGrade;

    public Student(String studentName){
        this.studentName = studentName;
        this.studentGrade = new ArrayList<>();

    }


    // returns the student's name
    public String getName(){
        return this.studentName;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade){
        studentGrade.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for(double grade : studentGrade){
            sum += grade;
        }
        return sum / studentGrade.toArray().length;
    }
}