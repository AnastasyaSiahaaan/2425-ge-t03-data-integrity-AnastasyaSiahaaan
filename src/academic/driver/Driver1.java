package academic.driver;

import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

/**
 * @author 12S2330 - Simorangkir Jonathan
 * @author 12S23046 - Anastasya T.B Siahaan
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course[] courses = new Course[100];
        Student[] students = new Student[100];
        Enrollment[] enrollments = new Enrollment[100];
        int courseCount = 0;
        int studentCount = 0;
        int enrollmentCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            if (parts.length > 0) {
                String command = parts[0];
                switch (command) {
                    case "course-add":
                        if (parts.length == 5) {
                            String code = parts[1];
                            String name = parts[2];
                            String credits = parts[3];
                            String passingGrade = parts[4];
                            courses[courseCount++] = new Course(code, name, credits, passingGrade); // untuk menambahkan
                                                                                                    // data ke array
                                                                                                    // courses
                        }
                        break;
                    case "student-add":
                        if (parts.length == 5) {
                            String code = parts[1];
                            String name = parts[2];
                            String year = parts[3];
                            String major = parts[4];
                            students[studentCount++] = new Student(code, name, year, major);
                        }
                        break;
                    case "enrollment-add":
                        if (parts.length == 5) {
                            String courseCode = parts[1];
                            String studentId = parts[2];
                            String year = parts[3];
                            String semester = parts[4];
                            String notes = "None";
                            enrollments[enrollmentCount++] = new Enrollment(courseCode, studentId, year, semester,
                                    notes);
                        }
                        break;
                }
            }
        }
        scanner.close();

        for (int i = courseCount - 1; i >= 0; i--) {
            System.out.println(courses[i]);
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }

        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(enrollments[i]);
        }
    }
}
