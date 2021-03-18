import java.util.ArrayList;

public class grades {

    public class Student {
        private String name;
        private ArrayList<Integer>grades;
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade);

    // returns the average of the students grades
    public double getGradeAverage();


}
