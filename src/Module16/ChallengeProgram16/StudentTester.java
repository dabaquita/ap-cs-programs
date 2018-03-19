package Module16.ChallengeProgram16;

/**
 * Tests the Student.java class using
 * traversals, insertions, and deletions.
 *
 * @author Denielle Kirk Abaquita
 * @version 10 March 2018
 */

import java.util.List;
import java.util.ArrayList;

public class StudentTester {

    /** Main Method */
    public static void main(String[] args) {

        // Declare a list of students, names, grades
        List<Student> students = new ArrayList<>();
        String[] names = {"Denielle Abaquita", "Kavya Shah", "Bob Dylan", "Megan Ryan", "Karen Blu"};
        double[] grades = new double[5];

        // Initialize each student
        for (int i = 0; i < 5; i++) {
            grades = newQuizGrades(grades.length);
            students.add(new Student(names[i], grades));
        }

        // Manipulate the lists using traversals, insertions, and deletions
        System.out.println("Starting Gradebook: \n");
        output(students);

        replaceName(students, "Kavya Shah", "Edwin Aldrin");
        output(students);

        replaceQuiz(students, "Megan Ryan", 2, 98.3);
        output(students);

        grades = newQuizGrades(grades.length);
        replaceStudent(students, "Karen Blu", "Elon Musk", grades);
        output(students);

        grades = newQuizGrades(grades.length);
        addBefore(students, "Bob Dylan", "Marie Lu", grades);
        output(students);

        delete(students, "Megan Ryan");
        output(students);
    }

    public static double[] newQuizGrades(int numOfGrades)
    {
        double[] grades = new double[numOfGrades];

        for (int i = 0; i < grades.length; i++) {       // creates a random grade from 70 - 100
            grades[i] = Math.random() * (100 - 70 + 1) + 70;
        }
        return grades;
    }

    /**
     * Outputs a list of students with their grades
     * @param students - list of student objects
     * */
    public static void output(List<Student> students) {
        System.out.printf("%-20s%8s%8s%8s%8s%8s\n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("------------------------------------------------------------------");
        for (Student student: students) {
            System.out.printf("%-26s", student.getName());
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-8.2f", student.getGrade(i));
            }
            System.out.println();
        }
    }

    /**
     * Replaces the name of a student with a new name
     * @param students a list of student objects
     * @param nameFind old name to find
     * @param newName new name to replace
     */
    public static void replaceName(List<Student> students, String nameFind, String newName)
    {
        for (Student student: students) {
            if (nameFind.equals(student.getName())) {
                student.setName(newName);
                System.out.println("\n<<< Replace " + nameFind + " with " + newName + " >>>\n");
            }
        }

    }

    /**
     * Replaces the quiz score of a student
     * @param students - list of student objects
     * @param nameFind - the specific student to perform operation on
     * @param quizNum - the specific quiz under the student to replace
     * @param quizScore - the new score as replacement
     */
    public static void replaceQuiz(List<Student> students, String nameFind, int quizNum, double quizScore)
    {
        for (Student student: students)
        {
            if (nameFind.equals(student.getName())) {
                student.setGrade(quizNum, quizScore);
                System.out.println("\n<<< Replace " + nameFind + "'s #" + quizNum +
                        " Quiz with score " + quizScore + " >>>\n");
            }
        }
    }

    /**
     * Replaces a specific student with a new student
     * @param students - list of student objects
     * @param nameFind - name of the student to be replaced
     * @param newName - the new student's name
     * @param scores - the new student's scores in an array
     */
    public static void replaceStudent(List<Student> students, String nameFind, String newName, double[] scores)
    {
        Student newStudent = new Student(newName, scores);

        for (Student student: students)
        {
            if (nameFind.equals(student.getName())) {
                int index = students.indexOf(student);
                students.set(index, newStudent);
                System.out.println("\n<<< Replace " + nameFind + " with " + newName + " >>>\n");
            }
        }
    }

    /**
     * Places a new student before a specific student
     * @param students - list of student objects
     * @param nameFind - name of the student to be after new student
     * @param newName - the new student's name
     * @param scores - the new student's scores in an array
     */
    public static void addBefore(List<Student> students, String nameFind, String newName, double[] scores)
    {
        Student newStudent = new Student(newName, scores);

        for (int i = 0; i < students.size(); i++)
        {
            if (nameFind.equals(students.get(i).getName())) {
                students.add(i, newStudent);
                System.out.println("\n<<< Add " + newName + " before " + nameFind + " >>>\n");
                break;
            }
        }
    }

    /**
     * Deletes a student from the list
     * @param students - list of student objects
     * @param name - name of the student to delete
     */
    public static void delete(List<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (name.equals(students.get(i).getName())) {
                students.remove(students.get(i));
                System.out.println("\n<<< Remove " + name + " from list >>>\n");
                break;
            }
        }
    }

}
