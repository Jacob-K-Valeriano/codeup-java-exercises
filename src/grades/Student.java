package grades;

import java.util.ArrayList;


//===== Create a class named Student. It should have private properties for the student's name, and grades. =====//
    public class Student {
    private String name;
    private ArrayList<Integer> grades;    //<===== The grades property should be an ArrayList of integers =====//


    //===== The student class should have a constructor that sets name property, and initializes the grades =====//
    public Student(String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<>();
    }


    //===== THE STUDENT CLASS SHOULD HAVE THE FOLLOWING METHODS =====//4


//===== Returns the student's name =====//
    public String getName() {
        return this.name;
    }

//===== Adds the given grade to the grades property =====//
    public void addGrade(int grade) {
        grades.add(grade);
    }

//===== Returns the average of the students grades =====//
    public double getGradeAverage() {
        double total = 0;
        for (int grade : this.grades) {
            total += grade;
        }
        return total / this.grades.size();
    }


//===== Test your Student class by adding a main method and creating Student objects =====//
    public static void main(String[] args) {
        Student Jacob = new Student("Jacob");
        Jacob.addGrade(100);
        Jacob.addGrade(80);
        Jacob.addGrade(95);
        Jacob.addGrade(65);
        Jacob.addGrade(100);

        Student CardiD = new Student("CardiD");
        CardiD.addGrade(62);
        CardiD.addGrade(64);
        CardiD.addGrade(60);
        CardiD.addGrade(68);
        CardiD.addGrade(67);

    System.out.println("Jacob's Avg: " + Jacob.getGradeAverage());
    System.out.println("CardiD's Avg: " + CardiD.getGradeAverage());
    }

}
