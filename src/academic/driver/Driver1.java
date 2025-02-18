package academic.driver;

import java.util.Scanner;
import java.util.ArrayList;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

/**
 * @author 12S23030 - Simorangkir Jonathan
 * @author 12S23046 - Anastasya T.B Siahaan
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
            
            String[] data = input.split("#");
            String type = data[0];

            switch (type) {
                case "course-add":
                    if (data.length == 5) {
                        String id = data[1];
                        String name = data[2];
                        int credit = Integer.parseInt(data[3]);
                        String passingGrade = data[4];
                        courses.add(new Course(id, name, credit, passingGrade));
                    }
                    break;
                case "student-add":
                    if (data.length == 5) {
                        String id = data[1];
                        String name = data[2];
                        int year = Integer.parseInt(data[3]);
                        String studyProgram = data[4];
                        students.add(new Student(id, name, year, studyProgram));
                    }
                    break;
                case "enrollment-add":
                    if (data.length == 5) {
                        String courseId = data[1];
                        String studentId = data[2];
                        String academicYear = data[3];
                        String semester = data[4];
                        String grade = "None"; 
                        enrollments.add(new Enrollment(courseId, studentId, academicYear, semester, grade));
                    }
                    break;
            }
        }
        scanner.close();

        for (int i = courses.size() - 1; i >= 0; i--) {
            System.out.println(courses.get(i));
        }


        for (Student student : students) {
            System.out.println(student);
        }


        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}
