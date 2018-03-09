package Module16.ChallengeProgram16;

/**
* This class defines a student object with a name and grades.
*
* @author Denielle Kirk Abaquita
* @version 9 March 2018
*/

import java.util.List;
import java.util.ArrayList;

public class Student 
{
    // Instance variables
    String name;
    List<Double> grades = new ArrayList<>();
    
    /** DEFAULT CONSTRUCTOR */ 
    public Student() {}
    
    /** 
    * CONSTRUCTOR TO INITIALIZE VARS
    * @param name - the name of the student
    * @param grades - an array of grades to be added
    */
    public Student(String name, Double[] grades)
    {
        this.name = name;
        for (double grade: grades) {        
            this.grades.add(grade);
        }
    }

    /**
    * Getter for name
    * @return name - of the student
    */
    public String getName() { return name; }
    
    /**
    * Getter for grade
    * @param quizNum - the position of the quiz grade
    * @return quiz grade from grades array
    */
    public double getGrade(int quizNum) { return grades.get(quizNum); }
    
    /**
    * Setter for name
    * @param name - the name to be assigned to the object
    */
    public void setName(String name) { this.name = name; }
    
    /**
    * Setter for grade at an index
    * @param quizNum - the position of the quiz
    * @param quizGrade - the score the quiz
    */
    public void setGrade(int quizNum, double quizGrade) { grades.set(quizNum, quizGrade); }
    
    /**
    * Creates and returns string value for student
    * @return string representation of student
    */
    @Override
    public String toString() 
    {
        String student = "Student: " + this.name +
                                "\nGrades:";
        for (double grade: grades)
        {
            student += " " + grade + ",";
        }
        return student;
    }
    
    
}
